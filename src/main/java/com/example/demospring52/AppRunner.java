package com.example.demospring52;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;


@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ResourceLoader resourceLoader;

//    @Autowired
//    ApplicationEventPublisher applicationEventPublisher;

//    @Autowired
//    MessageSource messageSource;

//    @Autowired
//    ApplicationContext ctx;

//    @Autowired
//    BookRepository bookRepository;
//
//    @Autowired
//    Single single;
//
//    @Autowired
//    Proto proto;
//
//    @Value("${app.name}")
//    String appname;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        var ctx = new GenericApplicationContext("xxx.xml");

        System.out.println(resourceLoader.getClass());
        Resource resource = resourceLoader.getResource("classpath:test.txt");
        // 스프링 부트 내장 톰캣에는 ContextPath가 지정되있지 않음. (ServletContextResource 의 경우)
        // 따라서, ContextPath를 따로 지정하지 않을 시에는 에러가 뜸. 그래서 classpath를 추천.
        System.out.println(resource.getClass());
        /*
         * location에 classpath안적으면 ServletcontextResource 기준으로 찾음. (현재 ApplicationContext가 WebServerApplicationContext이기 때문)
         * ex) classpath:me/whiteship/config.xml        -> ClassPathResource
         * ex) file:///some/resource/config.xml         -> FileSystemResource
         * ex) 나머지는 ServletContextResource
         * 이렇게 접두사를 붙이는 것을 추천!! (명시적이기 때문)
         */
        System.out.println(resource.exists());
        System.out.println(resource.getDescription());
        System.out.println(Files.readString(Path.of(resource.getURI())));

//        applicationEventPublisher.publishEvent(new MyEventOld(this,100));
//        applicationEventPublisher.publishEvent(new MyEvent(this,200));
//        while (true) {
//            System.out.println(messageSource.getMessage("greeting",new String[]{"keesun"}, Locale.KOREA));
//            System.out.println(messageSource.getMessage("greeting",new String[]{"keesun"}, Locale.US));
//            Thread.sleep(1000);
//        }

//        System.out.println("PROTO");
//        System.out.println(ctx.getBean(Proto.class));
//        System.out.println(ctx.getBean(Proto.class));
//        System.out.println(ctx.getBean(Proto.class));
//        System.out.println(proto);
//        System.out.println("SINGLE");
//        System.out.println(ctx.getBean(Single.class));
//        System.out.println(ctx.getBean(Single.class));
//        System.out.println(ctx.getBean(Single.class));
//
//        System.out.println("proto by single");
//        System.out.println(ctx.getBean(Single.class).getProto());
//        System.out.println(ctx.getBean(Single.class).getProto());
//        System.out.println(ctx.getBean(Single.class).getProto());
//
//        Environment environment = ctx.getEnvironment();
//        System.out.println("Active" + Arrays.toString(environment.getActiveProfiles()));
//        System.out.println("Default" + Arrays.toString(environment.getDefaultProfiles()));
//        System.out.println(environment.getProperty("app.name"));
//        System.out.println("appname: " + appname);
    }
}
