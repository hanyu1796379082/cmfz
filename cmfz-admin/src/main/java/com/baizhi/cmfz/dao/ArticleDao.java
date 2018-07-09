package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author 韩雨
 * @Time in 9:50 2018/7/9
 * @Despriction
 */
public interface ArticleDao {

    public List<Article> selectAllArt(@Param("page")Integer page,@Param("rows")Integer rows);

    public List<Article> selectAnyArt(@Param("name")String name,@Param("value")String value,@Param("page")Integer page,@Param("rows")Integer rows);

    public int insertArt(Article art);

    public int updateArt(Article art);

    public int selectAnyArtCount(@Param("name")String name,@Param("value")String value);

    public int selectAllArtCount();
}
