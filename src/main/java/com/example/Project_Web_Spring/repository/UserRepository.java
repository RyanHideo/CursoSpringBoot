package com.example.Project_Web_Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project_Web_Spring.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
