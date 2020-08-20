package com.mr.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

//    @Autowired
    private FortuneService fortuneService;

//    public TennisCoach() {
//        System.out.println(">> TennisCoach: inside default constructor");
//    }

    @Autowired
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        System.out.println(">> TennisCoach: inside default constructor");
        this.fortuneService = fortuneService;
    }

    @PostConstruct
    private void doMyStartupStuff() {
        System.out.println(">> TennisCoach: inside of doMyStartupStuff method");
    }

    @PreDestroy
    private void doMyCleanupStuff() {
        System.out.println(">> TennisCoach: inside of doMyCleanupStuff method");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println(">> TennisCoach: inside setFortuneService method");
//        this.fortuneService = fortuneService;
//    }
}
