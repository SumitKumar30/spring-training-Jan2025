package com.airtel.spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext  context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        EnglishGreetingService s1 = (EnglishGreetingService) context.getBean("englishGreetingService");
        s1.greet("John");
        System.out.println(s1.getTimeService().getCurrentTime());
    }
}
