package com.springboot.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    // define init method
    @PostConstruct
    public void initMethod() {
        System.out.println("Init method: " + getClass().getSimpleName());
    }

    // define destroy method
    @PreDestroy
    public void destroyMethod() {
        System.out.println("Destroy method: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!";
    }
}
