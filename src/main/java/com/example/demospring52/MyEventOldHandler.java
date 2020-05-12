package com.example.demospring52;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

// 4.2 미만은 핸들러 이용
@Component
public class MyEventOldHandler implements ApplicationListener<MyEventOld> {
    @Override
    public void onApplicationEvent(MyEventOld event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("이벤트를 받음. 데이터는 " + event.getData());
    }
}
