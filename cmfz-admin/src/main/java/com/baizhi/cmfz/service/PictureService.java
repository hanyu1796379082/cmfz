package com.baizhi.cmfz.service;

import com.baizhi.cmfz.entity.Picture;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author 韩雨
 * @Time in 9:03 2018/7/6
 * @Despriction
 */
public interface PictureService {

    public List<Picture> queryAllPic( Integer page,Integer rows);

    public int queryPicCount();

    public int removePic(Integer id);

    public int addPic(Picture pic);

    public int modifyPic(Picture pic);
}
