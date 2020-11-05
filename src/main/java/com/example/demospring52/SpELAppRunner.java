package com.example.demospring52;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.ParseException;
import org.springframework.expression.ParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

@Component
public class SpELAppRunner implements ApplicationRunner {

    @Value("#{1+1}")                // 표현식
    int value;

    @Value("#{'hello ' + 'world'}")
    String greeting;

    @Value("#{1 eq 1}")
    boolean trueOrFalse;

    @Value("hello")
    String hello;

    @Value("${my.value}")           // 프로퍼티. 프로퍼티 안에서는 표현식을 사용 못 함. 표현식에서 프로퍼티는 사용 가능.
            int myValue;

    @Value("#{${my.value} eq 100}")           // 프로퍼티. 프로퍼티 안에서는 표현식을 사용 못 함.
            boolean isMyValue100;

    @Value("#{'spring'}")
    String spring;

    @Value("#{sample.data}")                // Bean도 사용 가능.
            int sampleData;

    // @Query("select u from User u where u.firstname = :#{#customer.fisrtname})
    // List<User> findUserByCustomerFirstname(@Param("customer") Customer customer);

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        System.out.println("================");
//        System.out.println(value);
//        System.out.println(greeting);
//        System.out.println(trueOrFalse);
//        System.out.println(myValue);
//        System.out.println(isMyValue100);
//        System.out.println(spring);
//        System.out.println(sampleData);
//
//        ExpressionParser parser = new SpelExpressionParser();
//        Expression expression = parser.parseExpression("2+100");
//        Integer value = expression.getValue(Integer.class);                     // Conversion Service
//        System.out.println(value);

    }
}
