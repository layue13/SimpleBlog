package com.sblog.simpleblog.service;

import com.sblog.simpleblog.entity.User;

public interface UserService {
    User login(String username, String password);

    boolean register(User user);

    User findById(int id);

    boolean update(User user);

    boolean existsByName(String username);
}
