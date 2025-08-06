package com.userex.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.userex.entity.User;

@Service
public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
	User getUser(Long id);
}
