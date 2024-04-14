package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
    private int id = 10;

    public void show() {
        System.out.println(id);
    }
}
