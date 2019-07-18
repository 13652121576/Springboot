package com.ydm.springboot.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @Autowired
    Person person;

    @ResponseBody
    @RequestMapping("/sayHello")
    public String sayHello(){
        return "hello world"+person;
    }
}