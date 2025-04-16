package com.superlabs.usermanagement.controller;



import com.superlabs.usermanagement.model.User;
import com.superlabs.usermanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserApiController {

    @Autowired
    private UserRepository userRepository;

    // GET all users
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // GET latest user (same as your profile logic)
    @GetMapping("/latest")
    public User getLatestUser() {
        return userRepository.findTopByOrderByIdDesc();
    }

    // POST new user
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
