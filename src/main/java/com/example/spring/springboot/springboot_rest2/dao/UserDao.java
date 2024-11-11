package com.example.spring.springboot.springboot_rest2.dao;


import com.example.spring.springboot.springboot_rest2.model.User;

import java.util.List;

public interface UserDao {

    void update(User user);

    void save(User user);

    void delete(Long id);

    User findById(Long id);

    List<User> findAll();
}
