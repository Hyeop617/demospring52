package com.example.demospring52;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {

    @EventListener
//    @Order(Ordered.HIGHEST_PRECEDENCE + 2)              // 높은 우선순위 보다 살짝 낮음.
    @Async                                    // 비동기 처리 할 때는 Order 작동 안함.
    public void handle(MyEvent event){
        System.out.println(Thread.currentThread().toString());
        System.out.println("메세지를 받았다. (4.2 이후) 데이터는 : " + event.getData());
    }

    @EventListener
    @Async
    public void handle(ContextRefreshedEvent event){
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextRefreshedEvent");
        // ApplicationContext를 초기화 했거나, 리프레쉬 했을 때 발생

    }

    @EventListener
    @Async
    public void handle(ContextClosedEvent event){
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextClosedEvent");
        // ApplicationContext를 close()하여 싱글톤 빈이 소멸되는 시점에 발생.

    }
}
