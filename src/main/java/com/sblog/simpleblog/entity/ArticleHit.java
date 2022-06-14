package com.sblog.simpleblog.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class ArticleHit {
    private Integer id;
    private Article article;
    private String hitIp;
    private Date hitTime;
}
