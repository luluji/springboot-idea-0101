package com.yyp.springbootidea0101.service;

import com.yyp.springbootidea0101.dao.LoginDao;
import com.yyp.springbootidea0101.pojo.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginDao loginDao;


    @Override
    public List<Login> queryLogin(String loginname, String loginpassword) {
        return loginDao.queryLogin(loginname,loginpassword);
    }
}
