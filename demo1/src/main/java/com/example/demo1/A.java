package com.example.demo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {
    private final B b;

    @Autowired
    public A(B b) {
        this.b = b;
    }
    public void doSomething() {
        b.doSomething();
        double pi = 3.14159;
        System.out.println("The value of pi is: " + pi);
    }
}
