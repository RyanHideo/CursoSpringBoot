package com.example.Project_Web_Spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Project_Web_Spring.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

    @Query("Select u from User u where u.name like %?1%")
    User findByName(String name);

    @org.springframework.data.mongodb.repository.Query("{ 'email' : ?0 }")
    User findByEmail(String email);

    User findById(int id);

    User findByNameIgnoreCaseLike(String name);
}
