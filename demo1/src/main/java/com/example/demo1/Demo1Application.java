package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}

@Component
class Hello1 {
	//浏览器请求/hello地址，会调用hello()方法
	public String greet(String name) {
		return "Hello, " + name + "!";
	}
}
