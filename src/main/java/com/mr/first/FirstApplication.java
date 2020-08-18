package com.mr.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstApplication.class, args);

        Coach theCoach = new TrackCoach();
        System.out.println(theCoach.getDailyWorkout());
    }

}
