package com.example.demo.service;



import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User createUser(User user);
    void deleteUser(Long id);
}

