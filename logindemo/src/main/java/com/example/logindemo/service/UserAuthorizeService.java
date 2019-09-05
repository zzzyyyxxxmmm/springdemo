package com.example.logindemo.service;

import com.example.logindemo.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

/**
 * @author jikangwang
 * This part should be implement with real sql
 */
@Service
public class UserAuthorizeService {
    ArrayList<User> users=new ArrayList<User>();

    public boolean verify(User user){
        return users.contains(user);
    }

    public void insert(User user){
        users.add(user);
    }

    public User findUserByToken(String token){
        return users.stream().filter(u->u.getToken().equals(token)).findAny().get();
    }

    public Optional<User> findUserByAccountId(String s) {
        return users.stream().filter(u->u.getId().equals(Integer.valueOf(s))).findAny();
    }
}
