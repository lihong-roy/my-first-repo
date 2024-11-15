package com.example.demo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {
    private final B b;

    @Autowired
    public A(B b) {
        this.b = b;
        b.doSomething();
    }
}
