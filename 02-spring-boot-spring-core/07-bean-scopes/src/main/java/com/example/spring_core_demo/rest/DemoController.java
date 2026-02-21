package com.example.spring_core_demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;
import com.example.spring_core_demo.common.Coach;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class DemoController {

  // define a private field for the dependency
  private Coach myCoach;

  private Coach anotherCoach;

  // constructor injection
  @Autowired
  public DemoController(
    // default scope == singleton
    // both dependency injections for the bean will reference SAME bean
    @Qualifier("cricketCoach") Coach theCoach,
    @Qualifier("cricketCoach") Coach theAnotherCoach) {

      System.out.println("In constructor: " + getClass().getSimpleName());
      myCoach = theCoach;
      anotherCoach = theAnotherCoach;
  }

  // expose a new endpoint for daily workout
  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }

  @GetMapping("/check")
  public String check() {
      return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
  }
  
  
}
