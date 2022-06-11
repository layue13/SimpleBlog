package com.sblog.simpleblog.dao;

import com.sblog.simpleblog.entity.BlogInfo;

import java.util.List;

/**
 * @author 32958
 * 个性设置信息表
 */
public interface BlogInfoMapper {


    List<BlogInfo> findAllBlogInfo();


    BlogInfo findBlogTitleByUserId(int id);

    int insert(BlogInfo blogInfo);

    int update(BlogInfo blogInfo);

    int deleteById(int Id);


}
