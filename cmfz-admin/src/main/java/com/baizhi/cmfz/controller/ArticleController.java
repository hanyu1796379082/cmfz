package com.baizhi.cmfz.controller;
import com.baizhi.cmfz.entity.Article;
import com.baizhi.cmfz.service.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 韩雨
 * @Time in 15:01 2018/7/9
 * @Despriction
 */
@Controller
@RequestMapping("/art")
public class ArticleController {

    @Autowired
    private ArtService as;
    @RequestMapping("/add")
    public  @ResponseBody Map<String,Object> addArt(String txt, String name, Integer guruid, Boolean status ){

        Map<String,Object> map = new HashMap<String ,Object>();
        Article ac = new Article();
        ac.setGuruid(guruid);
        ac.setDate(new java.util.Date());
        ac.setName(name);
        ac.setIntroduction(txt);
        int result  = as.addArt(ac);
        if(result>0){
            map.put("result","success");
        }else{
            map.put("result","fail");
        }
        return map;
    }
}
