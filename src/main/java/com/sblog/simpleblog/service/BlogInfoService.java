package com.sblog.simpleblog.service;

import com.sblog.simpleblog.entity.BlogInfo;
import com.sblog.simpleblog.entity.User;

public interface BlogInfoService {
    BlogInfo findByUser(User user);

    boolean update(BlogInfo blogInfo);

    boolean add(BlogInfo blogInfo);

    boolean existByUser(User user);
}
