package com.baizhi.cmfz.service;

import com.baizhi.cmfz.entity.Menu;

import java.util.List;

public interface MenuService {

    public List<Menu>  queryMenuByPId(Integer id);

    public List<Menu>  queryAllMenu();
}
