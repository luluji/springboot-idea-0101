package com.yyp.springbootidea0101;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.yyp.springbootidea0101.dao")
@SpringBootApplication
public class SpringbootIdea0101Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootIdea0101Application.class, args);
    }

}

