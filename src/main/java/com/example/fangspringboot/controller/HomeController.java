package com.example.fangspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liupeng
 * @DateTime: 2020/3/30 16:34
 * @Description: TODO
 */
@RestController
//RestController和Controller注解的区别是：RestController是返回的内容就是返回的内容，相当于加个@ResponseBody,而controller一般是返回的页面
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        return "hello world";
    }
}
