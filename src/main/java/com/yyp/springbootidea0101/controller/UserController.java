package com.yyp.springbootidea0101.controller;


import com.yyp.springbootidea0101.pojo.LeeJSONResult;
import com.yyp.springbootidea0101.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class UserController {

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
}
