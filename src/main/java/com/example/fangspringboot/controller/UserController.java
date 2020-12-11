package com.example.fangspringboot.controller;

import com.example.fangspringboot.model.UserModel;
import com.example.fangspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liupeng
 * @DateTime: Created in 2020/12/10 21:00
 * @version: 1.0
 * @Description: TODO
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    public UserModel getUser(@RequestParam(name="id")Integer id) {
        UserModel userModel = userService.getUser(id);
        return userModel;
    }
}
