package com.example.redisdemo.service;

/**
 * @author jikangwang
 */
public interface UmsMemberService {
    String generateAuthCode(String telephone);
    boolean verifyAuthCode(String telephone, String authCode);
}
