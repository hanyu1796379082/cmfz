package com.baizhi.cmfz.service.impl;

import com.baizhi.cmfz.dao.ManagerDao;
import com.baizhi.cmfz.entity.Manager;
import com.baizhi.cmfz.service.ManagerService;
import com.baizhi.cmfz.util.Encryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.security.NoSuchAlgorithmException;

@Service
@Transactional
public class ManagerServiceImpl implements ManagerService{

    @Autowired
    private ManagerDao md;


    @Override
    @Transactional(readOnly = true)
    public Manager queryByName(String name) {
        Manager manager = md.selectByName(name);
        return manager;
    }

    @Override
    public int addManager(Manager mgr) {
        String salt = "";
        int result = 0;
        try {
            salt = Encryption.getRandomSalt(4);
            mgr.setPassword(Encryption.encryption(mgr.getPassword()+salt));
            mgr.setSalt(salt);
           result =  md.insertMgr(mgr);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result;
    }
}
