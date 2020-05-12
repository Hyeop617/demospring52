package com.example.demospring52;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AnotherHandler {

    @EventListener
//    @Order(Ordered.HIGHEST_PRECEDENCE)      // 높은 우선순위.
    @Async                                    // 비동기 처리 할 때는 Order 작동 안함.
    public void handle(MyEvent myEvent){
        System.out.println(Thread.currentThread().toString());
        System.out.println("Another " + myEvent.getData());
    }
}
