package com.example.logindemo.dto;

import lombok.Data;

/**
 * @author jikangwang
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;
}
