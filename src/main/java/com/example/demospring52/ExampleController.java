package com.example.demospring52;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExampleController {

    @RequestMapping("/helloworld")
    public String helloworld(Model model){
        model.addAttribute("hello", 123456);
        return "helloworld";
    }
}
