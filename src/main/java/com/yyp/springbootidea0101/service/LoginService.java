package com.yyp.springbootidea0101.service;

import com.yyp.springbootidea0101.pojo.Login;

import java.util.List;

public interface LoginService {
    List<Login> queryLogin(String loginname , String loginpassword);
}
