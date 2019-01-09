package com.yyp.springbootidea0101.controller;

import com.yyp.springbootidea0101.pojo.LeeJSONResult;
import com.yyp.springbootidea0101.pojo.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
    @Autowired
    private Resource resource;

    @RequestMapping("/getResource")
    public Object getResource(){
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource,bean);
        return LeeJSONResult.ok(bean);
    }
}
