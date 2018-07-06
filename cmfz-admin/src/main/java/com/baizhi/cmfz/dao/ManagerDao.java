package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Manager;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManagerDao {

    public Manager selectByName(@Param("name") String name);

    public List<Manager> selectAll();

    public int insertMgr(Manager mgr);

}
