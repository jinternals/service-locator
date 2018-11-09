package com.jinternals.locator.services.impl;

import com.jinternals.locator.services.MyService;
import org.springframework.stereotype.Service;

@Service("B")
public class MyService2 implements MyService {
    @Override
    public void print() {
        System.out.println("MyService2");
    }
}
