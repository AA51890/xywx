package com.example.xywx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by XieWei  on 2020/6/2
 */
@RestController
public class HelloController {

    @RequestMapping(value={"commit","save"})
    public String hello(HttpServletRequest request){
        System.out.println("[\"request.getServletPath()\"] = " + request.getServletPath().substring(1));
        return request.getServletPath().substring(1);
    }
}
