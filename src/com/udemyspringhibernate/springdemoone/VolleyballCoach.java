package com.udemyspringhibernate.springdemoone;

public class VolleyballCoach implements Coach {

    private FortuneService fortuneService;

    public VolleyballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Perform 15 spikes and 5 minutes of volleys";
    }

}

