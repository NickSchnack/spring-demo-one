package com.udemyspringhibernate.springdemoone;

public class VolleyballCoach implements Coach {

    private FortuneService fortuneService;

    public VolleyballCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Perform 15 spikes and 5 minutes of volleys";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}

