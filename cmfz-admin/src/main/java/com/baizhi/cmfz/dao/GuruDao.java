package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Guru;

import java.util.List;

public interface GuruDao {

    public List<Guru> selectAllGuru(Integer page,Integer rows);
}
