package com.example.demo1;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class MyServiceTest {
    @Autowired
    private Hello1 hello;
    @Autowired
    private A a;
    @Test
    public void testGreet() {
        Assert.assertEquals("Hello, World!", hello.greet("World"));
    }
    @Test
    public void teste() {
        a.doSomething();
//        Assert.assertEquals(126, e.doSomething());
    }
}
