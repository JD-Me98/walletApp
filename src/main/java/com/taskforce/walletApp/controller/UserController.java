package com.taskforce.walletApp.controller;

import com.taskforce.walletApp.model.User;
import com.taskforce.walletApp.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/users")
public class UserController {
    final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/adduser")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}