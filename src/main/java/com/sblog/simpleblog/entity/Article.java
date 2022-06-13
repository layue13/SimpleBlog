package com.sblog.simpleblog.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Article {
    private Integer id;
    private String title;
    private String content;
    private Date publishTime;
    private Long commentAmount;
    private User publisher;
}
