package com.example.demospring52;

import java.beans.PropertyEditorSupport;

// Thread-safe 하지 않기 때문에, 절대 @Bean으로 등록하지 말것!!!!!!!!!
public class EventBindingEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        EventBinding eventBinding = (EventBinding) getValue();
        return eventBinding.getId().toString();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new EventBinding(Integer.parseInt(text)));
    }
}
