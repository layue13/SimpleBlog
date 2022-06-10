package com.sblog.simpleblog.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Article {
    private int id;
    private String title;
    private String content;
    private Date publishTime;
    private long commentAmount;
    private User publisher;
}
