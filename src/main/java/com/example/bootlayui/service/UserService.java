package com.example.bootlayui.service;

import com.example.bootlayui.bean.User;

import java.util.List;

public interface UserService {
    void save(User user);
    void update(User user);
    void delete(String id);
    List<User> findAll();
    User findById(String id);
}
