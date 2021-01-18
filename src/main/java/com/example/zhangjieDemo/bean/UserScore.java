package com.example.zhangjieDemo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserScore {
    int id;
    String name;
    int score;
    UserBean user;
}
