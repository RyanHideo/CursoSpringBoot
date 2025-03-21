package com.example.Project_Web_Spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Project_Web_Spring.repository.UserRepository;
import com.example.Project_Web_Spring.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String getUsers(Model model) {
        model.addAttribute("userslist", this.userService.findAll());

        return "user";
    }

}
