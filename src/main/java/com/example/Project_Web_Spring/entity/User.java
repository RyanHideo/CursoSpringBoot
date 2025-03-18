package com.example.Project_Web_Spring.entity;

import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Document
@Table(name = "usuarios")
public class User {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    // @ManyToMany
    // private List<Role> roles;
    private Set<Role> roles;
    private String name;
    private String email;

    public User() {
    }

    public String getId() {
        return id;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
