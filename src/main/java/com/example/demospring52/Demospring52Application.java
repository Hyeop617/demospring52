package com.example.demospring52;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
public class Demospring52Application {

    public static void main(String[] args) {
        SpringApplication.run(Demospring52Application.class,args);
    }

    @Bean
    public MessageSource messageSource(){
        // messages.properties 수정(Build)할 시 실시간으로 바뀜.
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:/messages");
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setCacheSeconds(3);               // 캐쉬 3초로 설정.
        return messageSource;
    }

}
