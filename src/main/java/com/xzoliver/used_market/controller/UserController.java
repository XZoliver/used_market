package com.xzoliver.used_market.controller;

import com.xzoliver.used_market.entity.Goods;
import com.xzoliver.used_market.entity.Users;
import com.xzoliver.used_market.serviceimpl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 创建人：肖易安
 * 创建时间：  2020/5/18
 * 注释：null
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    private UserServiceImpl userService;

    /**
     * 创建人：肖易安
     * 创建时间：  2020/5/18
     * 注释：用户注册
     **/
    @PostMapping("register")
    public String register(@RequestBody HttpServletRequest req, HttpSession session, String username, String password) {
        Users user = new Users();
        user.setUsername(username);
        user.setPassword(password);
        int log = userService.register(user);
        if (log == 0) {
            return "注册失败";
        } else {
            return "注册成功";
        }
    }

    @PostMapping("login")
    public String login(@RequestBody HttpServletRequest request, HttpSession session, String username, String password) {
        boolean success = userService.login(username, password);
        if (success) {
            return "登陆成功";
        } else {
            return "登陆失败";
        }
    }

    @GetMapping("homePage")
    public List<Goods> getAllGoods(@RequestBody HttpServletRequest request, HttpSession session) {
        return userService.getAllGoods();
    }

    @GetMapping("personalPage")
    public Users userHome(@RequestBody HttpServletRequest request, HttpSession session, Integer userId) {
        return userService.userHome(userId);
    }

    @GetMapping("goodsPage")
    public Goods goodsPage(@RequestBody HttpSession session, HttpServletRequest request, Integer goodId) {
        return userService.goodView(goodId);
    }

}
