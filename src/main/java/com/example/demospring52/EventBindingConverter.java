package com.example.demospring52;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

public class EventBindingConverter {

    // PropertyEditor를 대체하는 데이터 바인딩 인터페이스.
    // Converter<S,T> 앞의 인자가 소스, 뒤의 인자가 타겟
    // Converter, Formatter는 Thread-safe하기 대문에, Bean으로 등록 가능.
    // ConverterRegistry에 등록해서 사용해야함. (스프링부트는 직접 쓸 일 없음. 그냥 @Component로 Converter를 등록)
    @Component
    public static class StringToEventConverter implements Converter<String, EventBinding>{
        @Override
        public EventBinding convert(String source) {
            return new EventBinding(Integer.parseInt(source));
        }
    }

    @Component
    public static class EventToStringConverter implements Converter<EventBinding, String>{
        @Override
        public String convert(EventBinding source) {
            return source.getId().toString();
        }
    }

}
