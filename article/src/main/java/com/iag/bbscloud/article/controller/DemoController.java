package com.iag.bbscloud.article.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午2:31
 */
@RestController
public class DemoController {
    @Value("${server.port}")
    private String port;

    @GetMapping("hi")
    public String hello(){
        return "hello, " + port;
    }
}
