package com.baizhi.cmfz.controller;

import com.alibaba.fastjson.JSON;
import com.baizhi.cmfz.entity.Picture;
import com.baizhi.cmfz.service.PictureService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.*;

import static org.aspectj.weaver.tools.cache.SimpleCacheFactory.path;

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
        int count = ps.queryPicCount();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("total",count);
        map.put("rows", pictures);
        return  map;
    }
    @RequestMapping("/add")
    public @ResponseBody HashMap<String,Object> addPic(MultipartFile myFile, String descrip, String status, HttpSession session) throws  Exception{

        String realPath = session.getServletContext().getRealPath("\\");
        String uploadPath = realPath.substring(0,realPath.lastIndexOf("\\", realPath.lastIndexOf("\\")-1))+"\\upload\\picture";
        String path = UUID.randomUUID().toString().replace("-","")+".jpg";
        myFile.transferTo(new File(uploadPath+"/"+path));
        Picture pic = new Picture();
        pic.setPath(path);
        pic.setDate(new java.util.Date());
        pic.setStatus(status);
        pic.setDescrip(descrip);
        HashMap<String,Object> map = new HashMap<String,Object>();
        int result = ps.addPic(pic);
        if(result>0){
            map.put("success",true);
        }
        return  map;
    }
    @RequestMapping("/change")
    public @ResponseBody Map<String,Object> changePic(Picture pic) throws Exception{
        HashMap<String,Object> map = new HashMap<String,Object>();
        int result = ps.modifyPic(pic);
        if(result>0){
            map.put("result","success");
        }else{
            map.put("result","fail");
        }
        return map;
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
