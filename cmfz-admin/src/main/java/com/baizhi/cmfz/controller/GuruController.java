package com.baizhi.cmfz.controller;

import com.baizhi.cmfz.entity.Guru;
import com.baizhi.cmfz.service.GuruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 韩雨
 * @Time in 19:12 2018/7/7
 * @Despriction
 */
@Controller
@RequestMapping("/guru")
public class GuruController {

    @Autowired
    private GuruService gs;

    @RequestMapping("all")
    public @ResponseBody Map<String,Object> selectGuru(Integer page,Integer rows) throws Exception{
        Map<String,Object> map = new HashMap<String,Object>();
        List<Guru> gurus = gs.queryGuru(page, rows);
        for (Guru guru : gurus) {
            guru.setName(URLDecoder.decode(guru.getName(),"utf-8"));
            guru.setSummary(URLDecoder.decode(guru.getSummary(),"utf-8"));
        }
        int count = gs.queryGuruCount();
        map.put("total",count);
        map.put("rows", gurus);
        return map;
    }
    @RequestMapping("add")
    public @ResponseBody Map<String, Object> addGuru(Guru guru) throws Exception{
        Map<String,Object> map = new HashMap<String,Object>();
        guru.setName(URLEncoder.encode(guru.getName(),"utf-8"));
        guru.setSummary(URLEncoder.encode(guru.getSummary(),"utf-8"));
        int result = gs.addGuru(guru);
        if(result>0){
            map.put("result","true");
        }else{
            map.put("result","false");
        }
        return map;
    }
    @RequestMapping("change")
    public @ResponseBody Map<String, Object> changeGuru(Guru guru) throws Exception{
        System.out.println(guru);
        Map<String,Object> map = new HashMap<String,Object>();
        guru.setName(URLEncoder.encode(guru.getName(),"utf-8"));
        guru.setSummary(URLEncoder.encode(guru.getSummary(),"utf-8"));
        int result = gs.modifyGuru(guru);
        if(result>0){
            map.put("result","true");
        }else{
            map.put("result","false");
        }
        return map;
    }

}
