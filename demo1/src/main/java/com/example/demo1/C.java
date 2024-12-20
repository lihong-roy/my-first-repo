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

    public int doSomething() {
        return d.doSomething();
    }
}
