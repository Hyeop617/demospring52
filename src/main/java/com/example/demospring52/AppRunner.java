package com.example.demospring52;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AppRunner implements ApplicationRunner {


    @Autowired
    ApplicationContext ctx;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    Single single;

    @Autowired
    Proto proto;

    @Value("${app.name}")
    String appname;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("PROTO");
        System.out.println(ctx.getBean(Proto.class));
        System.out.println(ctx.getBean(Proto.class));
        System.out.println(ctx.getBean(Proto.class));
        System.out.println(proto);
        System.out.println("SINGLE");
        System.out.println(ctx.getBean(Single.class));
        System.out.println(ctx.getBean(Single.class));
        System.out.println(ctx.getBean(Single.class));

        System.out.println("proto by single");
        System.out.println(ctx.getBean(Single.class).getProto());
        System.out.println(ctx.getBean(Single.class).getProto());
        System.out.println(ctx.getBean(Single.class).getProto());

        Environment environment = ctx.getEnvironment();
        System.out.println("Active" + Arrays.toString(environment.getActiveProfiles()));
        System.out.println("Default" + Arrays.toString(environment.getDefaultProfiles()));
        System.out.println(environment.getProperty("app.name"));
        System.out.println("appname: " + appname);
    }
}