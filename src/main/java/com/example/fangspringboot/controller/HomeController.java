package com.example.fangspringboot.controller;

import com.alibaba.druid.sql.visitor.functions.Char;
import com.example.fangspringboot.util.GZIPUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author: liupeng
 * @DateTime: 2020/3/30 16:34
 * @Description: TODO
 */
@RestController
//RestController和Controller注解的区别是：RestController是返回的内容就是返回的内容，相当于加个@ResponseBody,而controller一般是返回的页面
public class HomeController {

    private static final String ENCODING = "UTF-8";

    @RequestMapping("/home")
    public String home(HttpServletResponse response){
        String str =
                "流浪地球，相信你也看过，哈哈，你觉得怎么样呢，这不重要，重要的是可以压缩哦!一个现象就是，当数据不多时，压缩反而变大，你可以试试看哦，" +
                        "流浪地球，相信你也看过，哈哈，你觉得怎么样呢，这不重要，重要的是可以压缩哦!一个现象就是，当数据不多时，压缩反而变大，你可以试试看哦，流浪地球，相信你也看过，哈哈，你觉得怎么样呢，这不重要，重要的是可以压缩哦!一个现象就是，当数据不多时，压缩反而变大，你可以试试看哦流浪地球，相信你也看过，哈哈，你觉得怎么样呢，这不重要，重要的是可以压缩哦!一个现象就是，当数据不多时，压缩反而变大，你可以试试看哦流浪地球，相信你也看过，哈哈，你觉得怎么样呢，这不重要，重要的是可以压缩哦!一个现象就是，当数据不多时，压缩反而变大，你可以试试看哦流浪地球，相信你也看过，哈哈，你觉得怎么样呢，这不重要，重要的是可以压缩哦!一个现象就是，当数据不多时，压缩反而变大，你可以试试看哦流浪地球，相信你也看过，哈哈，你觉得怎么样呢，这不重要，重要的是可以压缩哦!一个现象就是，当数据不多时，压缩反而变大，你可以试试看哦流浪地球，相信你也看过，哈哈，你觉得怎么样呢，这不重要，重要的是可以压缩哦!一个现象就是，当数据不多时，压缩反而变大，你可以试试看哦流浪地球，相信你也看过，哈哈，你觉得怎么样呢，这不重要，重要的是可以压缩哦!一个现象就是，当数据不多时，压缩反而变大，你可以试试看哦";
        System.out.println("原字符串：" + str);
        System.out.println("原长度：" + str.length());
        try {
            byte[] data = str.toString().getBytes(ENCODING);
            byte[] chars = GZIPUtils.compress(data);
            System.out.println("压缩后长度：" + chars.length);
            return chars.toString();
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
}
