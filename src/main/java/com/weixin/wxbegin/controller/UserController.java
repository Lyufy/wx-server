package com.weixin.wxbegin.controller;

import com.weixin.wxbegin.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable long id){
        return userService.queryUserById(id).toString();
    }
}
