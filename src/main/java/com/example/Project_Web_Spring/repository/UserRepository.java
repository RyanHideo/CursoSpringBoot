package com.example.Project_Web_Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Project_Web_Spring.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("Select u from User u where u.name like %?1%")
    User Encontrarpornome(String name);

    User findByEmail(String email);

    User findById(int id);

    User findByNameIgnoreCase(String name);
}
