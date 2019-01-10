package com.yyp.springbootidea0101.controller;



import com.yyp.springbootidea0101.pojo.LeeJSONResult;
import com.yyp.springbootidea0101.pojo.Login;
import com.yyp.springbootidea0101.pojo.User;
import com.yyp.springbootidea0101.service.LoginService;
import com.yyp.springbootidea0101.service.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private LoginServiceImpl loginServiceImpl;

    @RequestMapping("/getUser")
    public LeeJSONResult getUser(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date=null;
        try {
            date = simpleDateFormat.parse("2019-01-02 21:26:28");

        } catch (ParseException e) {
            e.printStackTrace();
        }
        String name = "yyp";
        User user = new User(name, "molia", date,25, null);
        return LeeJSONResult.ok(user);
    }

    @RequestMapping("/login")
    public List<Login> login(HttpServletRequest request) {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        System.out.println("name:"+name+"  password:"+password);
        List<Login> logins = loginServiceImpl.queryLogin(name, password);
        System.out.println(logins);
        return logins;
    }
}
