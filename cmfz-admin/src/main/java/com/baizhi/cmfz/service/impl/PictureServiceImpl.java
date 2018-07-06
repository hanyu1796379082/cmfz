package com.baizhi.cmfz.service.impl;

import com.baizhi.cmfz.dao.PictureDao;
import com.baizhi.cmfz.entity.Picture;
import com.baizhi.cmfz.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author 韩雨
 * @Time in 9:07 2018/7/6
 * @Despriction
 */
@Service
@Transactional
public class PictureServiceImpl implements PictureService{

    @Autowired
    private PictureDao pd;


    @Override
    @Transactional(readOnly = true)
    public List<Picture> queryAllPic(Integer page,Integer rows) {
       Integer begin = (page-1)*rows;
       Integer end = rows;
        return pd.selectAllPic(begin,end);
    }

    @Override
    public int queryPicCount() {
        return pd.selectPicCount();
    }

    @Override
    public int removePic(Integer id) {
        return pd.deletePic(id);
    }

    @Override
    public int addPic(Picture pic) {
        return pd.insertPic(pic);
    }

    @Override
    public int modifyPic(Picture pic) {
        return pd.updatePic(pic);
    }
}
