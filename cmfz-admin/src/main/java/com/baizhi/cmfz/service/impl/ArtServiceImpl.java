package com.baizhi.cmfz.service.impl;

import com.baizhi.cmfz.dao.ArticleDao;
import com.baizhi.cmfz.entity.Article;
import com.baizhi.cmfz.service.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 韩雨
 * @Time in 15:38 2018/7/9
 * @Despriction
 */
@Service
@Transactional
public class ArtServiceImpl implements ArtService{
    @Autowired
    private ArticleDao ad;

    @Override
    @Transactional(readOnly = true)
    public Map<String, Object> queryAllArt(Integer page, Integer rows) {
        List<Article> articles = ad.selectAllArt((page - 1) * rows, rows);
        int count = ad.selectAllArtCount();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("total",count);
        map.put("rows", articles);
        return map;
    }

    @Override
    @Transactional(readOnly = true)
    public Map<String, Object> queryAnyArt(String name, String value, Integer page, Integer rows) {
        List<Article> articles = ad.selectAnyArt(name, value, (page - 1) * rows, rows);
        int count = ad.selectAnyArtCount(name, value);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("total",count);
        map.put("rows", articles);
        return map;
    }

    @Override
    public int addArt(Article art) {
        return  ad.insertArt(art);
    }

    @Override
    public int modifyArt(Article art) {
        return ad.updateArt(art);
    }
}
