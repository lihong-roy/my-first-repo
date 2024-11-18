package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;

public class G {
    private final C c;

    @Autowired
    public G(C c) {
        this.c = c;
    }

    public void doSomething() {
        int pi=c.doSomething();
        System.out.println("The value of pi is: " + pi);
    }
}
