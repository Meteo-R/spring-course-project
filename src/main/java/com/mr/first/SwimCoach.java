package com.mr.first;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim an Iron Man distance";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
