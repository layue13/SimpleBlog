package com.sblog.simpleblog.entity;

import lombok.Data;

@Data
public class Comment {
    private Integer id;
    private Article article;
    private String content;
    private User owner;
}
