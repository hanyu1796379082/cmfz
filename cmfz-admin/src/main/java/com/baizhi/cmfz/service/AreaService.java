package com.baizhi.cmfz.service;

import com.baizhi.cmfz.entity.Area;

import java.util.List;

/**
 * @Author 韩雨
 * @Time in 20:15 2018/7/9
 * @Despriction
 */
public interface AreaService {

    public List<Area> queryArea(String sex);

    public List<Area> queryAllArea();
 }
