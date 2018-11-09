package com.jinternals.locator.services.impl;

import com.jinternals.locator.services.MyService;
import org.springframework.stereotype.Service;

@Service("A")
public class MyService1 implements MyService {
    @Override
    public void print() {
        System.out.println("MyService1");
    }
}
