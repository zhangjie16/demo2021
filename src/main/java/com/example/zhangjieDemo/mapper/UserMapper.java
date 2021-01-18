package com.example.zhangjieDemo.mapper;


import com.example.zhangjieDemo.bean.UserBean;
import com.example.zhangjieDemo.bean.UserScore;

public interface UserMapper {

    UserBean getInfo(String name, String password);

    UserScore getUserScore();
}