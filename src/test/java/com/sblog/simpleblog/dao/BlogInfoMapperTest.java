package com.sblog.simpleblog.dao;

import com.sblog.simpleblog.SimpleBlogApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author 32958
 */
@SpringBootTest(classes = {SimpleBlogApplication.class})
@SpringBootApplication
@Transactional
class BlogInfoMapperTest {
    private BlogInfoMapper blogInfoMapper;

    @Autowired
    public void setBlogInfoMapper(BlogInfoMapper blogInfoMapper) {
        this.blogInfoMapper = blogInfoMapper;
    }

    @Test
    void findAllBlogInfo() {
        System.out.println(1);
    }

    @Test
    void findBlogTitleByUserId() {
        assertEquals(blogInfoMapper.findBlogTitleByUserId(5).getTitle(), "titleTest");
    }

    @Test
    void apply() {
//        User user = new User();
//        user.setId(1);
//        BlogInfo blogInfo = new BlogInfo();
//        blogInfo.setSignature("牛逼");
//        blogInfo.setTitle("牛逼");
//        blogInfo.setUser(user);
//        assertEquals(blogInfoMapper.apply(blogInfo),1);
//        assertEquals(blogInfoMapper.findBlogTitleByUserId(user.getId()).toString(),blogInfo.toString());
    }

    @Test
    void modify() {
    }

    @Test
    void removeById() {
    }
}