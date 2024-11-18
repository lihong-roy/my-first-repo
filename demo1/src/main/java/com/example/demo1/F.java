package com.example.demo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class F {
    private final G g;

    @Autowired
    public F(G g) {
        this.g = g;
//        int number = 123;
//        System.out.println("The number is: " + number);
    }
    public void doSomething() {
        g.doSomething();
        double pi = 3.14159;
        System.out.println("The value of pi is: " + pi);
    }
}
