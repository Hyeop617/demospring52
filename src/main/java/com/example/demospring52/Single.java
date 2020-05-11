package com.example.demospring52;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Single {

    @Autowired
    private Proto proto;

    @Autowired
    private ApplicationContext applicationContext;

    public Proto getProto() {
        return proto;
    }
}
