package com.sblog.simpleblog.service.impl;

import com.sblog.simpleblog.SimpleBlogApplication;
import com.sblog.simpleblog.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = {SimpleBlogApplication.class})
@SpringBootApplication
class UserServiceImplTest {
    @Autowired
    private UserService userService;

    @Test
    void login() {
        assertEquals(userService.login("testUserName", "testPassword"),true);
    }
}