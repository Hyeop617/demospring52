package com.example.demospring52.aop;

import java.lang.annotation.*;
/*
 * 이 애노테이션을 사용하면 성능을 로깅해 줍니다.
 */

//@Retention(RetentionPolicy.SOURCE)                // SOURCE는 컴파일 하면 사라짐.
@Retention(RetentionPolicy.CLASS)                   // CLASS는 바이트코드(.class)까지 남아 있음. (기본값)
@Documented
@Target(ElementType.METHOD)
public @interface PerLogging {
}

