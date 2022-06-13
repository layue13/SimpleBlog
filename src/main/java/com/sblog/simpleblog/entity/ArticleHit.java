package com.sblog.simpleblog.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ArticleHit {
    private Integer id;
    private Article article;
    private String hitIp;
    private Date hitTime;
}
