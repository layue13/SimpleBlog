package com.sblog.simpleblog.dao;

import com.sblog.simpleblog.SimpleBlogApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author 32958
 */
@SpringBootTest(classes = {SimpleBlogApplication.class})
@SpringBootApplication
class UserMapperTest {

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Test
    void findAllUser() {
        assertEquals(userMapper.findAllUser().get(0).getNickName(), "jack");
    }

    @Test
    void findUserById() {
        assertEquals(userMapper.findUserById(1).getName(), "2782911547");
    }

    @Test
    void findUserByName() {
        assertEquals(userMapper.findAllUser().get(0).getName(), "2782911547");
    }

    @Test
    void apply() {
    }

    @Test
    void modifyUser() {
    }

    @Test
    void removeUserById() {
    }

    @Test
    void selectByKeyword() {
    }
}