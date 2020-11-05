package com.example.demospring52.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AopAppRunner implements ApplicationRunner {

    @Autowired
    EventService eventService;              // interface 타입이 있는 경우에는, interface로 주입 받는 것 추천.

    @Override
    public void run(ApplicationArguments args) throws Exception {
        eventService.createEvent();
        eventService.publishEvent();
        eventService.deleteEvent();
    }
}
