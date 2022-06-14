package com.sblog.simpleblog.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Article {
    private Integer id;
    private String title;
    private String content;
    private Date publishTime;
    private Long commentAmount;
    private User publisher;
}
