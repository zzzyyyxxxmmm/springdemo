package com.example.logindemo.entity;

import lombok.Data;

/**
 * @author jikangwang
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
