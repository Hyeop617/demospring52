package com.example.demospring52;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
public class Demospring52Application {

    public static void main(String[] args) {
        SpringApplication.run(Demospring52Application.class,args);
    }

}
