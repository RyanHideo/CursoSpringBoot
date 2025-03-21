package com.example.Project_Web_Spring.service;
//Onde irá ficar a regra de negocio

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Project_Web_Spring.entity.User;
import com.example.Project_Web_Spring.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll() {

        return userRepository.findAll();
    }
}
