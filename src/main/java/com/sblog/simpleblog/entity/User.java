package com.sblog.simpleblog.entity;


import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private String nickName;
    private String password;
    private String passwordQuestion;
    private String passwordQuestionAnswer;
}
