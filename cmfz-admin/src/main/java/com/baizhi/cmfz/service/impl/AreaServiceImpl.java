package com.baizhi.cmfz.service.impl;

import com.baizhi.cmfz.dao.AreaDao;
import com.baizhi.cmfz.entity.Area;
import com.baizhi.cmfz.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author 韩雨
 * @Time in 20:20 2018/7/9
 * @Despriction
 */
@Service
@Transactional
public class AreaServiceImpl implements AreaService{
    @Autowired
    private AreaDao ad;

    @Override
    @Transactional(readOnly = true)
    public List<Area> queryArea(String sex) {
        List<Area> areas = ad.selectArea(sex);
        return areas;
    }

    @Override
    @Transactional
    public List<Area> queryAllArea() {
        return ad.selectAllArea();
    }


}
