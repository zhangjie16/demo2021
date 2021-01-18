package com.example.zhangjieDemo.serviceImpl;

import com.example.zhangjieDemo.mapper.UserMapper;
import com.example.zhangjieDemo.bean.UserScore;
import com.example.zhangjieDemo.service.UserScoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class UserScoreImpl implements UserScoreService {

    @Resource
    UserMapper userMapper;

    @Override
    public UserScore getAllUserScore() {
        UserScore res = userMapper.getUserScore();
        log.info("result is:" + res);
        return userMapper.getUserScore();
    }



}
