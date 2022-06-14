package com.sblog.simpleblog.entity;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private Integer id;
    private String name;
    private String nickName;
    private String password;
    private String passwordQuestion;
    private String passwordQuestionAnswer;
}
