package com.example.Project_Web_Spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Project_Web_Spring.repository.UserRepository;

@Controller
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String requestMethodName(@RequestParam String param) {
        return new String();
    }

    @RequestMapping("/user")
    public String getUsers(Model model) {
        model.addAttribute("userslist", this.userRepository.findAll());

        return "user";
    }
}
