package com.sblog.simpleblog.dao;

import com.sblog.simpleblog.entity.BlogInfo;
import com.sblog.simpleblog.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 32958
 * 个性设置信息表
 */
@Mapper
public interface BlogInfoMapper {


    List<BlogInfo> findAllBlogInfo();


    BlogInfo findBlogTitleByUserId(int id);

    int apply(BlogInfo blogInfo);

    int modify(BlogInfo blogInfo);

    int removeById(int Id);

    int isExistInfo(User user);

}
