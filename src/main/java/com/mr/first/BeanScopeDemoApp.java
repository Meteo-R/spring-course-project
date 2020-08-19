package com.mr.first;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        Coach coach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean areTheSame = (coach == alphaCoach);

        System.out.println();
        System.out.println("Pointing to the same object: " + areTheSame);
        System.out.println("Memory location for coach: " + coach);
        System.out.println("Memory location for alphaCoach: " + alphaCoach);
        System.out.println();

        context.close();
    }

}
