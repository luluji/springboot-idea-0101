package com.yyp.springbootidea0101.dao;

import com.yyp.springbootidea0101.pojo.Login;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface LoginDao {
    List<Login> queryLogin(@Param("loginname") String loginname , @Param("loginpassword") String loginpassword);
}
