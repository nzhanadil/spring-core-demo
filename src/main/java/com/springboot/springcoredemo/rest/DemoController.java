package com.springboot.springcoredemo.rest;

import com.springboot.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private filed for the dependency
    private Coach myCoach;

    // define a constructor for dependency injection
    @Autowired
    public DemoController(@Qualifier("tennisCoach") Coach theCoach) {
        myCoach = theCoach;
    }

    // define a setter for dependency injection
//    @Autowired
//    public void setMyCoach(Coach theCoach) {
//        myCoach = theCoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
