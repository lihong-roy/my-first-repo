package com.example.demo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class D {
    private final E e;

    @Autowired
    public D(E e) {
        this.e = e;
    }

    public void doSomething() {
        e.doSomething();
    }
}
