package com.example.spring.springboot.springboot_rest2.Service;


import com.example.spring.springboot.springboot_rest2.model.User;

import java.util.List;

public interface UserService {
    void save(User user);

    void update(User user);

    void delete(Long id);

    User findById(Long id);
    List<User> findAll();
}
