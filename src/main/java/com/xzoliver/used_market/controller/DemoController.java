package com.xzoliver.used_market.controller;

import com.xzoliver.used_market.entity.User;
import com.xzoliver.used_market.serviceimpl.DemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *创建人：肖易安
 *创建时间：2020/5/15
 **/
@Controller
@RequestMapping("/test")
public class DemoController {
    @Autowired
    private DemoServiceImpl demoService ;

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demoTest(HttpServletRequest req, HttpSession session){
        return "demo" ;
    }

}
