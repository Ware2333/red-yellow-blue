package com.ryb.oauth.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 常坤
 */
@RestController
@RequestMapping("/Oauth")
public class OauthController {
    @PostMapping(value = "test", produces = {"application/json;charset=UTF-8"})
    public String test() {
        return "测试成功";
    }
}
