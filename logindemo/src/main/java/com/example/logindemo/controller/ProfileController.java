package com.example.logindemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author jikangwang
 */
@Controller
public class ProfileController {
    @GetMapping("/profile")
    public String pp(){
        return "index";
    }


    @PostMapping("/profile")
    public String profile(HttpServletRequest request,
                          @RequestParam("name") String name,
                          @RequestParam("password") String password,
                          Model model){
        return "index";
    }
}
