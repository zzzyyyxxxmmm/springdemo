package com.example.logindemo.controller;


import com.example.logindemo.dto.AccessTokenDTO;
import com.example.logindemo.dto.GithubUser;
import com.example.logindemo.provider.GithubProvider;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * @author jikangwang
 */
@Controller
public class AuthorizeController {

    @Autowired
    GithubProvider githubProvider;

    @Value("${github.client.id}")
    private String githubId;

    @Value("${github.clent.secret}")
    private String githubSecret;

    @Value("${github.redirect.url}")
    private String githubRedirectUrl;

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String state,
                           HttpServletRequest httpServletRequest,
                           HttpServletResponse httpServletResponse) {
        AccessTokenDTO accessTokenDTO=new AccessTokenDTO();
        accessTokenDTO.setClient_id(githubId);
        accessTokenDTO.setClient_secret(githubSecret);
        accessTokenDTO.setCode(code);
        accessTokenDTO.setRedirect_uri(githubRedirectUrl);
        String accessToken=githubProvider.getAccessToken(accessTokenDTO);

        GithubUser githubUser=githubProvider.getUser(accessToken);
        if(githubUser!=null){

            httpServletResponse.addCookie(new Cookie("token",""));

            //add cookie

            return "redirect:/";
        } else {
            return "redirect:/";
        }

    }
}
