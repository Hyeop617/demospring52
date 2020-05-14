//package com.example.demospring52;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.format.FormatterRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//// 스프링 부트를 쓰지 않는다면(Converter와 Fomatter를 Bean으로 직접 등록하지 않았다면) (Spring MVC)
//// Configurer에 Converter와 Formatter를 직접 등록해야함.
//// Configurer는 Converter와 Formatter를 ConversionService에 등록해주는 기능을 함.
//// 실제 변환은 ConversionService에서 이루어짐.
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addFormatters(FormatterRegistry registry) {
//        // Converter 사용
////        registry.addConverter(new EventBindingConverter.StringToEventConverter());
//
//        // Formatter 사용
//        registry.addFormatter(new EventBindingFormatter());
//    }
//}
