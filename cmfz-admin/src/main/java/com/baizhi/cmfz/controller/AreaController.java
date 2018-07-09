package com.baizhi.cmfz.controller;

import com.baizhi.cmfz.entity.Area;
import com.baizhi.cmfz.entity.AreaMain;
import com.baizhi.cmfz.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 韩雨
 * @Time in 20:32 2018/7/9
 * @Despriction
 */
@RequestMapping("/area")
@Controller
public class AreaController {

    @Autowired
    private AreaService as;
    @RequestMapping("/all")
    @ResponseBody
    public List<AreaMain> selectAllArea(){
        List<AreaMain> list = new  ArrayList<AreaMain>();
        AreaMain am;
        List<Area> areas = as.queryAllArea();
        for (Area area : areas) {
            am = new AreaMain();
            am.setName(area.getName());
            am.setValue(area.getValue());
            list.add(am);
        }
        return list;
    }
    @RequestMapping("/bysex")
    @ResponseBody
    public List<AreaMain> selectArea(String sex){
        List<AreaMain> list = new  ArrayList<AreaMain>();
        AreaMain amn;
        List<Area> areas = as.queryArea(sex);
        for (Area area : areas) {
            amn = new AreaMain();
            amn.setName(area.getName());
            amn.setValue(area.getValue());
            list.add(amn);
        }
        return list;
    }
}
