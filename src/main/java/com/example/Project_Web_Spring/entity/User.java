package com.example.Project_Web_Spring.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // @ManyToMany
    // private List<Role> roles;
    @ManyToMany
    private Set<Role> roles;
    private String name;
    private String email;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setId(Long id) {
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
