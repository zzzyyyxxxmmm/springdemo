package com.example.redisdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jikangwang
 */
@Controller
public class IndexContoller {
    @GetMapping("/")
    String index(){
        return "index";
    }
}
