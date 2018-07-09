package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Area;

import java.util.List;

/**
 * @Author 韩雨
 * @Time in 20:13 2018/7/9
 * @Despriction
 */
public interface AreaDao {

    public List<Area> selectAllArea();

    public List<Area> selectArea(String sex);
}
