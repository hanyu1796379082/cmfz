package com.baizhi.cmfz.controller;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.baizhi.cmfz.entity.Guru;
import com.baizhi.cmfz.service.GuruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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
        int count = gs.queryGuruCount();
        map.put("total",count);
        map.put("rows", gurus);
        return map;
    }

    @RequestMapping("anyAll")
    public @ResponseBody Map<String,Object> selectAnyGuru(String name,Integer page,Integer rows) throws Exception{
        Map<String, Object> map = gs.queryGuruByName(name, page, rows);
        return map;
    }
    @RequestMapping("add")
    public @ResponseBody Map<String, Object> addGuru(MultipartFile myFile, Guru guru, HttpSession session) throws Exception{
        String realPath = session.getServletContext().getRealPath("\\");
        String uploadPath = realPath.substring(0,realPath.lastIndexOf("\\", realPath.lastIndexOf("\\")-1))+"\\upload\\guru";
        String path = UUID.randomUUID().toString().replace("-","")+".jpg";
        myFile.transferTo(new File(uploadPath+"/"+path));
        Map<String,Object> map = new HashMap<String,Object>();
        guru.setPhoto(path);

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
        int result = gs.modifyGuru(guru);
        if(result>0){
            map.put("result","true");
        }else{
            map.put("result","false");
        }
        return map;
    }
    @RequestMapping("/addBatch")
    @ResponseBody
    public String addBatch(MultipartFile myFile ) {
        try {
            ImportParams ip = new ImportParams();
            List<Guru> gurus = ExcelImportUtil.importExcel(myFile.getInputStream(), Guru.class, ip);
            int result = gs.addGurus(gurus);
            for (Guru guru : gurus) {
                System.out.println(guru);
            }
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
