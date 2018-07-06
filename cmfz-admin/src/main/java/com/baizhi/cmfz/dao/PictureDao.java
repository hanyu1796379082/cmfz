package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Picture;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author 韩雨
 * @Time in 8:53 2018/7/6
 * @Despriction
 */
public interface PictureDao {

    public List<Picture> selectAllPic(@Param("begin") Integer begin,@Param("end") Integer end);

    public int selectPicCount();

    public int insertPic(Picture pic);

    public int updatePic(Picture pic);

    public int deletePic(Integer id);
}
