package com.example.demo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class C {
    private final D d;

    @Autowired
    public C(D d) {
        this.d = d;
    }

    public void doSomething() {
        d.doSomething();
        boolean truth = true;
        System.out.println("The truth is: " + truth);
    }
}
