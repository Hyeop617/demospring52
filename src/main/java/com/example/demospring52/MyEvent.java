package com.example.demospring52;

// 스프링 소스가 들어가지 않음. (프레임워크 소스가 없음)  -> POJO(Plain Old Java Object) -> 코드 깔끔, 유지보수 쉬움.
public class MyEvent {
    private int data;
    private Object object;


    public MyEvent(Object object, int data) {
        this.object = object;
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Object getObject() {
        return object;
    }
}
