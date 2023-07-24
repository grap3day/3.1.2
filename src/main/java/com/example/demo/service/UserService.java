package com.example.demo.service;


import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    void deleteUserFromTable(Long id);
    List<User> getAllUsers();
    User getUserById(Long id);
}
