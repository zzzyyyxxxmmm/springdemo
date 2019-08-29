package com.example.logindemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author jikangwang
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(HttpServletRequest httpServletRequest, Model model){
        return "index";
    }
}
