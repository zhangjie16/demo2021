package com.example.zhangjieDemo.serviceImpl;

import com.example.zhangjieDemo.bean.UserBean;
import com.example.zhangjieDemo.mapper.UserMapper;
import com.example.zhangjieDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    //@Autowired
    @Resource
    private UserMapper userMapper;
    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name,password);
    }
}
