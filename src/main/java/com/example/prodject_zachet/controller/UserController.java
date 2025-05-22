package com.example.prodject_zachet.controller;

import com.example.prodject_zachet.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private List<User> users = new ArrayList<>();

    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        users.add(user);
        return user;
    }
}
