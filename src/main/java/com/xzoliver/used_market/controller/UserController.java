package com.xzoliver.used_market.controller;

import com.xzoliver.used_market.entity.User;
import com.xzoliver.used_market.serviceimpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 创建人：肖易安
 * 创建时间：  2020/5/18
 * 注释：null
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    private UserServiceImpl userService ;

    /**
     * 创建人：肖易安
     * 创建时间：  2020/5/18
     * 注释：用户注册
     **/
    @PostMapping("register")
    public String register(@RequestBody HttpServletRequest req, HttpSession session , String username , String phone , String password) {
        User user = new User(username,password,phone);
        int log = userService.register(user);
        if (log == 0){
            return "注册失败";
        }else{
            return "注册成功";
        }
    }



}
