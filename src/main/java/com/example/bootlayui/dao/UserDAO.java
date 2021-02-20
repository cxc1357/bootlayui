package com.example.bootlayui.dao;

import com.example.bootlayui.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDAO {
    void save(User user);
    void update(User user);
    void delete(String id);
    List<User> findAll();
    User findById(String id);
}
