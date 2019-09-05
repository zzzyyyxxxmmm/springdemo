package com.example.redisdemo.controller;

import com.example.redisdemo.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author jikangwang
 */
@Controller
public class UmsMemberController {
    @Autowired
    private UmsMemberService memberService;

    @GetMapping("/auth")
    public String page(Model model){
        model.addAttribute("code","000000");
        return "auth";
    }

    @PostMapping(value = "/getAuthCode")
    public String getAuthCode(@RequestParam(name = "tel") String telephone,
                              Model model) {
        String code=memberService.generateAuthCode(telephone);
        model.addAttribute("code",code);
        return "auth";
    }

    @PostMapping(value = "/verifyAuthCode")
    public String updatePassword(@RequestParam(name = "codetel") String telephone,
                                 @RequestParam(name = "code") String authCode,
                                 Model model) {
        boolean result=memberService.verifyAuthCode(telephone,authCode);
        model.addAttribute("result",result);
        return "auth";
    }
}

