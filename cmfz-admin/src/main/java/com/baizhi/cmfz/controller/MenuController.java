package com.baizhi.cmfz.controller;

import com.baizhi.cmfz.entity.Menu;
import com.baizhi.cmfz.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author 韩雨
 * @Time in 14:22 2018/7/5
 * @Despriction
 */
@Controller
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService ms;
    @RequestMapping("/all")
    public @ResponseBody List<Menu> findAll() throws  Exception{
        return ms.queryAllMenu();
    }
}
