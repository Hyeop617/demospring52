package com.example.demospring52;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

// Converter, Formatter는 Thread-safe하기 대문에, Bean으로 등록 가능.
@Component
public class EventBindingFormatter implements Formatter<EventBinding> {
    @Override
    public EventBinding parse(String text, Locale locale) throws ParseException {
        return new EventBinding(Integer.parseInt(text));
    }

    @Override
    public String print(EventBinding object, Locale locale) {
        return object.getId().toString();
    }
}
