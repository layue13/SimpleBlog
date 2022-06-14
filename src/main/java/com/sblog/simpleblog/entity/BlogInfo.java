package com.sblog.simpleblog.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BlogInfo {
    private Integer id;
    private String title;
    private String signature;
    private User user;
}
