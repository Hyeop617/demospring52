package com.example.demospring52;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;

public class EventValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isInstance(ValidationEvent.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"title","notempty","Empty title is now allowed");

        /* ValidationUtils 없이 하는 방법 */
//        ValidationEvent event = (ValidationEvent) target;
//        if( event.getTitle() == null){
//            errors.rejectValue("title","notempty","Empty title is now allowed");
//        }
    }
}
