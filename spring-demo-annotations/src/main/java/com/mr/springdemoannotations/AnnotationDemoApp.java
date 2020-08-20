package com.mr.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("thatSillyCoach", Coach.class);

        System.out.println();
        System.out.println(coach.getDailyWorkout());
        System.out.println();

        context.close();
    }

}
