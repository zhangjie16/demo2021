package com.example.zhangjieDemo.service;

import com.example.zhangjieDemo.bean.UserBean;

public interface UserService {
    UserBean loginIn(String name, String password);
}
