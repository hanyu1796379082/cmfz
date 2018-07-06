package com.baizhi.cmfz.controller;

import com.alibaba.fastjson.JSON;
import com.baizhi.cmfz.entity.Picture;
import com.baizhi.cmfz.service.PictureService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 韩雨
 * @Time in 9:24 2018/7/6
 * @Despriction
 */
@Controller
@RequestMapping("/pic")
public class PictureContrller {
    @Autowired
    private PictureService ps;

    @RequestMapping("/all")
    public  @ResponseBody Map<String,Object> selectAll(Integer page, Integer rows) throws Exception{
        System.out.println(page);
        List<Picture> pictures = ps.queryAllPic(page,rows);
        for (Picture picture : pictures) {
            picture.setDescrip(URLDecoder.decode(picture.getDescrip(),"utf-8"));
        }
        int count = ps.queryPicCount();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("total",count);
        map.put("rows", pictures);
        return  map;
    }
    @RequestMapping("/add")
    public @ResponseBody HashMap<String,Object> addPic(String path,String descrip,String status) throws  Exception{
        Picture pic = new Picture();
        pic.setPath(path);
        pic.setDate(new java.util.Date());
        pic.setDescrip(URLEncoder.encode(descrip,"utf-8"));
        pic.setStatus(status);
        System.out.println(pic);
        HashMap<String,Object> map = new HashMap<String,Object>();
        int result = ps.addPic(pic);
        if(result>0){
            map.put("success",true);
        }
        return  map;
    }
    @RequestMapping("/change")
    public void changePic(Picture pic) throws Exception{
        ps.modifyPic(pic);
    }
    @RequestMapping("/remove")
    public @ResponseBody HashMap<String, Object> removePic(Integer id) throws Exception{
        HashMap<String,Object> map = new HashMap<String,Object>();
        int result = ps.removePic(id);
        if(result>0){
            map.put("success",true);
        }
        return  map;
    }
}
