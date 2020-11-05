package com.example.demospring52.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect {

    // Advice가 적용되는 대상
//    @Around("execution(* com.example..*.EventService.*(..))")   // ..은 모든 하위 패키지에 적용한다는 것을 뜻함.
    @Around("@annotation(PerLogging)" )
    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable{
        long begin = System.currentTimeMillis();
        Object retVal = pjp.proceed();
        System.out.println(System.currentTimeMillis() - begin);
        return retVal;

    }

    @Before("bean(simpleEventService)")
    public void hello(){
        System.out.println("HELLO !!");
    }
}


