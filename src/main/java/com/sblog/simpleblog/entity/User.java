package com.sblog.simpleblog.entity;


import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private String nickName;
    private String password;
    private String passwordQuestion;
    private String passwordQuestionAnswer;
}
