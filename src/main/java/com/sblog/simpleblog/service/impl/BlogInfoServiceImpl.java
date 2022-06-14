package com.sblog.simpleblog.service.impl;

import com.sblog.simpleblog.dao.BlogInfoMapper;
import com.sblog.simpleblog.entity.BlogInfo;
import com.sblog.simpleblog.entity.User;
import com.sblog.simpleblog.service.BlogInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogInfoServiceImpl implements BlogInfoService {

    private BlogInfoMapper blogInfoMapper;

    @Autowired
    public void setBlogInfoMapper(BlogInfoMapper blogInfoMapper) {
        this.blogInfoMapper = blogInfoMapper;
    }

    @Override
    public BlogInfo findByUser(User user) {
        return blogInfoMapper.findBlogTitleByUserId(user.getId());
    }

    @Override
    public boolean update(BlogInfo blogInfo) {
        return blogInfoMapper.modify(blogInfo) > 0;
    }

    @Override
    public boolean add(BlogInfo blogInfo) {
        return blogInfoMapper.apply(blogInfo) > 0;
    }

    @Override
    public boolean existByUser(User user) {
        return (blogInfoMapper.isExistInfo(user) == 1) ? true : false;
    }
}
