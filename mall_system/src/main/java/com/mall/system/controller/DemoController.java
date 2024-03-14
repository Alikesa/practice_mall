package com.mall.system.controller;

import cn.dev33.satoken.stp.StpUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class DemoController {

    @GetMapping("/getUser")
    public String getUser() {
        return "user:11123";
    }


    @GetMapping("/login")
    public String login() {
        StpUtil.login(10001);
        return "登录成功";
    }


    @GetMapping("/isLogin")
    public String isLogin() {
        return StpUtil.isLogin() ? "已登录" : "没有登录";
    }
}
