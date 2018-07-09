package com.baizhi.cmfz.service;

import com.baizhi.cmfz.entity.Article;

import java.util.Map;

/**
 * @Author 韩雨
 * @Time in 15:17 2018/7/9
 * @Despriction
 */
public  interface ArtService {

    public Map<String,Object> queryAllArt(Integer page,Integer rows);

    public Map<String,Object> queryAnyArt(String name,String value,Integer page,Integer rows);

    public int addArt(Article art);

    public int modifyArt(Article art);


}
