package com.sblog.simpleblog.entity;

import lombok.Data;

@Data
public class Comment {
    private int id;
    private Article article;
    private String content;
    private User owner;
}
