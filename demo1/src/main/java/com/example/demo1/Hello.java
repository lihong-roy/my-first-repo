package com.example.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//请求处理类
@RestController
public class Hello {
    //浏览器请求/hello地址，会调用hello()方法
    @RequestMapping("/hello")
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}
