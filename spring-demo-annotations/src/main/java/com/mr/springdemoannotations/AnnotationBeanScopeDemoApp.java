package com.mr.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        boolean areTheSame = (coach == alphaCoach);
        System.out.println();
        System.out.println("Pointing to the same object: " + areTheSame);
        System.out.println("coach object: " + coach);
        System.out.println("alphaCoach object: " + alphaCoach);
        System.out.println();

        context.close();
    }

}
