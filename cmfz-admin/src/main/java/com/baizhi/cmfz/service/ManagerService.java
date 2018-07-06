package com.baizhi.cmfz.service;

import com.baizhi.cmfz.entity.Manager;

public interface ManagerService {

    public Manager queryByName(String name);

    public int addManager(Manager mgr);

}
