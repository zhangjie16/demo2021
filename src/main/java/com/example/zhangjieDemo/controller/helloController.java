package com.example.zhangjieDemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class helloController {

    @RequestMapping("/main")
    public String sayHello(@RequestParam("name") String name , @RequestParam("id")String id){

        log.info("name = {},id = {};",name,id);
        return "index";
    }

}
