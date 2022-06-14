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
    public User login(String username, String password) {
        User user = userMapper.findUserByName(username);
        if (user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    @Override
    public boolean register(User user) {
        return false;
    }

    @Override
    public User findById(int id) {
        return userMapper.findUserById(id);
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean existsByName(String username) {
        return false;
    }
}
