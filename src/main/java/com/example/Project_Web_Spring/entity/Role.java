package com.example.Project_Web_Spring.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public class Role {

    @Id
    // @GeneratedValue(strategy= GenerationType.AUTO)
    private String id;
    private String name;

    public String getId() {
        return id;
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

}
