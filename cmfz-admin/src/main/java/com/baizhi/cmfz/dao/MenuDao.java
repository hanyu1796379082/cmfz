package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Menu;

import java.util.List;

/**
 * @Author 韩雨
 * @Time in 11:36 2018/7/5
 * @Despriction
 */
public interface MenuDao {

    public List<Menu> selectAllMenu();

    public List<Menu> selectAllByPid(Integer parent_id);

}
