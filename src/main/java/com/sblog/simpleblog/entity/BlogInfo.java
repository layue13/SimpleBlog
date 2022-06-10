package com.sblog.simpleblog.entity;

import lombok.Data;

@Data
public class BlogInfo {
    private int id;
    private String title;
    private String signature;
    private User user;
}
