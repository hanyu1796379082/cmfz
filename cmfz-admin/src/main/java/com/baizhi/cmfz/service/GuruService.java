package com.baizhi.cmfz.service;

import com.baizhi.cmfz.entity.Guru;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author 韩雨
 * @Time in 22:14 2018/7/6
 * @Despriction
 */
public interface GuruService {

    public List<Guru> queryGuru(Integer page, Integer rows);

    public Map<String,Object> queryGuruByName(String name,Integer page,Integer rows);

    public int queryGuruCount();

    public int modifyGuru(Guru guru);

    public int addGuru(Guru guru);

    public int addGurus(List<Guru> gurus);
}
