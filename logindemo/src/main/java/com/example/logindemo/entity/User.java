package com.example.logindemo.entity;

import lombok.Data;

/**
 * @author jikangwang
 */
@Data
public class User {
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
