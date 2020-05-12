package com.example.demospring52;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;
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
        applicationEventPublisher.publishEvent(new MyEventOld(this,100));
        applicationEventPublisher.publishEvent(new MyEvent(this,200));
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
