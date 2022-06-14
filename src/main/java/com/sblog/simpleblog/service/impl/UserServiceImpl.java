package com.sblog.simpleblog.service.impl;

import com.sblog.simpleblog.dao.UserMapper;
import com.sblog.simpleblog.entity.User;
import com.sblog.simpleblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public boolean login(String username, String password) {
        User user = userMapper.findUserByName(username);
        if (user == null) {
            return false;
        }
        return user.getPassword().equals(password);
    }

    @Override
    public User findUserById(int id) {
        return userMapper.findUserById(id);
    }
}
