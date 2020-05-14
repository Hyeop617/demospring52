//package com.example.demospring52;
//
//import java.beans.PropertyEditorSupport;
//
//// PropertyEditor
//// 스프링 3.0 버전 이전까지 쓰던 인터페이스.
//// 사용자가 입력한 값을, 객체에 동적으로 변환해 넣어주는 기능.
//// 사용자가 입력하는 값은 대부분 문자열인데, 이 값을 Int, Double, Long, 심지어 Event, Book 같은 도메인 값으로 변환해서 넣어주는 기능.
//// Thread-safe 하지 않기 때문에, 절대 @Bean으로 등록하지 말것!!!!!!!!!
//public class EventBindingEditor extends PropertyEditorSupport {
//
//    @Override
//    public String getAsText() {
//        EventBinding eventBinding = (EventBinding) getValue();
//        return eventBinding.getId().toString();
//    }
//
//    @Override
//    public void setAsText(String text) throws IllegalArgumentException {
//        setValue(new EventBinding(Integer.parseInt(text)));
//    }
//}
