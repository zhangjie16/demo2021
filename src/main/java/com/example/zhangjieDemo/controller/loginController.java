package com.example.zhangjieDemo.controller;

import com.example.zhangjieDemo.bean.UserBean;
import com.example.zhangjieDemo.bean.UserScore;
import com.example.zhangjieDemo.service.UserScoreService;
import com.example.zhangjieDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class loginController {


    @Autowired
    UserService userService;
    @Autowired
    UserScoreService userScoreService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping("/getScore")
    public String getScore(){

        UserScore user = userScoreService.getAllUserScore();
        return "login";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String name,String password){
        UserBean userBean = userService.loginIn(name,password);
        if(userBean!=null){
            return "success";
        }else {
            return "error";
        }
    }

}
