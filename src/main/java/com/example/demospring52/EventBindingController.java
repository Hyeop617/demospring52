package com.example.demospring52;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventBindingController {

    @GetMapping("/event/{event}")
    public String getEvent(@PathVariable EventBinding event){
        return event.getId().toString();
    }
}
