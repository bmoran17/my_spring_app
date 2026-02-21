package com.example.spring_core_demo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// since there are multiple implementations 
// make TrackCoach as the PRIMARY coach
@Primary 
public class TrackCoach implements Coach {
  
  @Override
  public String getDailyWorkout() {
    return "Run a hard 10k";
  }
}
