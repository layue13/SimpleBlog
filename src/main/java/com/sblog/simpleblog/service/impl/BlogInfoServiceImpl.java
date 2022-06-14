package com.sblog.simpleblog.service.impl;

import com.sblog.simpleblog.entity.BlogInfo;
import com.sblog.simpleblog.entity.User;
import com.sblog.simpleblog.service.BlogInfoService;
import org.springframework.stereotype.Service;

@Service
public class BlogInfoServiceImpl implements BlogInfoService {
    @Override
    public BlogInfo findByUser(User user) {
        return null;
    }

    @Override
    public boolean update(BlogInfo blogInfo) {
        return false;
    }

    @Override
    public boolean add(BlogInfo blogInfo) {
        return false;
    }

    @Override
    public boolean existByUser(User user) {
        return false;
    }
}
