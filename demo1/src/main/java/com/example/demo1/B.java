package com.example.demo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class B {
    private final C c;

    @Autowired
    public B(C c) {
        this.c = c;
    }

    public void doSomething() {
        int pi=c.doSomething();
        System.out.println("The value of pi is: " + pi);
    }
}
