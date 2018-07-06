package com.baizhi.cmfz.controller;

import com.baizhi.cmfz.entity.Manager;
import com.baizhi.cmfz.service.ManagerService;
import com.baizhi.cmfz.util.Encryption;
import com.baizhi.cmfz.util.NewValidateCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.URLEncoder;

@Controller
@RequestMapping("/mgr")
public class ManagerController {

    @Autowired
    private ManagerService ms;
    @RequestMapping("/login")
    public String  login(String name,String password,String enCode, Boolean status,HttpSession session) throws Exception{
        System.out.println(status    +   "    status");
        String massage = "";
        String code = (String) session.getAttribute("code");
        if(name.equals("")||password.equals("")){
            massage="账号密码不能为空";
            return "redirect:/login.jsp";
        }

        if(!code.equalsIgnoreCase(enCode)){
            massage="验证码错误";
            session.setAttribute("massage",massage);
            return "redirect:/menu/name";
        }

        Manager manager = ms.queryByName(name);
        if(manager==null){
            massage = "账号不存在";
            session.setAttribute("massage",massage);
            return "redirect:/login.jsp";
        }
        password = Encryption.encryption(password+manager.getSalt());
        System.out.println(password  +   "    password" );
        if(password.equals(manager.getPassword())){
            if(status==true){
                String name1 = URLEncoder.encode("name", "utf-8");
                System.out.println(name1);
                Cookie c1 = new Cookie("uname",name1);
                Cookie c2 = new Cookie("upwd",password);
            }
            return "redirect:/main.jsp";
        }
        massage = "账号密码有误";
        session.setAttribute("massage",massage);
        return  "redirect:/login.jsp";
    }
    @RequestMapping("/getImg")
    public String getImg(HttpServletResponse response,HttpSession session) throws Exception{
        NewValidateCodeUtils vCode = new NewValidateCodeUtils(100, 30, 5, 10);
       session.setAttribute("code",vCode.getCode());
        System.out.println(vCode.getCode());
        try {
            ServletOutputStream out = response.getOutputStream();
            vCode.write(out);
        } catch (IOException e){
            System.out.println("error");
        }
        return null;
    }

}
