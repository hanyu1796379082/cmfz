package com.baizhi.cmfz.service.impl;

import com.baizhi.cmfz.dao.MenuDao;
import com.baizhi.cmfz.entity.Menu;
import com.baizhi.cmfz.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * @Author 韩雨
 * @Time in 14:07 2018/7/5
 * @Despriction
 */
@Service
@Transactional
public class MenuServiceImpl implements MenuService{

    @Autowired
    private MenuDao md;


    @Override
    @Transactional
    public List<Menu> queryMenuByPId(Integer pid) {
        List<Menu> menus = md.selectAllByPid(pid);
        return menus;
    }

    @Override
    public List<Menu> queryAllMenu() {
        return md.selectAllMenu();
    }
}
