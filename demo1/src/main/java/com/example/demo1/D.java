package com.example.demo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class D {
    private final E e1;

    @Autowired
    public D(E e1) {
        this.e1 = e1;
    }

    public int doSomething() {
        return e1.doSomething();
    }
}
