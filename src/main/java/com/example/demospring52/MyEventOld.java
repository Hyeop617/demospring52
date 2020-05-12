package com.example.demospring52;

import org.springframework.context.ApplicationEvent;

// 스프링 4.2 미만은 extends ApplicationEvent
public class MyEventOld extends ApplicationEvent{

    private int data;

    public MyEventOld(Object source, int data) {
        super(source);
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
