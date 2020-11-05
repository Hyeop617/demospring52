package com.example.demospring52;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@PropertySource("classpath:/app.properties")                    // Environment의 프로퍼티를 쓸 때 사용.
@EnableAsync                // 비동기 쓸 때 사용 (ThreadPool도 설정하긴 해야함..)
public class Demospring52Application {

    public static void main(String[] args) {

        // 웹 서버 동작 끄는 방법. (실행 속도 더 빠름)
//        SpringApplication app = new SpringApplication(Demospring52Application.class);
//        app.setWebApplicationType(WebApplicationType.NONE);
//        app.run(args);


        SpringApplication.run(Demospring52Application.class,args);
    }

//    @Bean
//    public MessageSource messageSource(){
//        // messages.properties 수정(Build)할 시 실시간으로 바뀜.
//        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
//        messageSource.setBasename("classpath:/messages");
//        messageSource.setDefaultEncoding("UTF-8");
//        messageSource.setCacheSeconds(3);               // 캐쉬 3초로 설정.
//        return messageSource;
//    }

}
    