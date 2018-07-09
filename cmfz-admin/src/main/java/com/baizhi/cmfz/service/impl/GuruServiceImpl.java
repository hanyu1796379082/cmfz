package com.baizhi.cmfz.service.impl;

import com.baizhi.cmfz.dao.GuruDao;
import com.baizhi.cmfz.entity.Guru;
import com.baizhi.cmfz.service.GuruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 韩雨
 * @Time in 18:49 2018/7/7
 * @Despriction
 */
@Service
@Transactional
public class GuruServiceImpl implements GuruService {

    @Autowired
    private GuruDao gd;

    @Override
    @Transactional(readOnly = true)
    public List<Guru> queryGuru(Integer page, Integer rows){
            page = (page-1)*rows;
        List<Guru> gurus = gd.selectAllGuru(page, rows);
        return gurus;
    }

    @Override
    @Transactional(readOnly = true)
    public Map<String, Object> queryGuruByName(String name, Integer page, Integer rows) {
        Map<String,Object> map = new HashMap<String,Object>();
        List<Guru> gurus = gd.selectGuruByFname(name, (page - 1) * rows, rows);
        int count = gd.selectGuruByFnameCount(name);
        map.put("total",count);
        map.put("rows", gurus);
        return map;
    }

    @Override
    @Transactional(readOnly = true)
    public int queryGuruCount() {
        return gd.selectGuruCount();
    }


    @Override
    public int modifyGuru(Guru guru) {
        return gd.updateGuru(guru);
    }

    @Override
    public int addGuru(Guru guru) {
        return gd.insertGuru(guru);
    }

    @Override
    public int addGurus(List<Guru> gurus) {
        int result = gd.insertGurus(gurus);
        return result;
    }
}
