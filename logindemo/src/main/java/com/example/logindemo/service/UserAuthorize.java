package com.example.logindemo.service;

import com.example.logindemo.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author jikangwang
 */
@Service
public class UserAuthorize {
    ArrayList<User> users=new ArrayList<User>();

    UserAuthorize(){
        users.add(new User("123","123"));
        users.add(new User("1","1"));
    }


    public boolean verify(User user){
        return users.contains(user);
    }
}
