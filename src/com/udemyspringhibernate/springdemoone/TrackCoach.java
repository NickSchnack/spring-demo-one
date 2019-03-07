package com.udemyspringhibernate.springdemoone;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void startupActivities() {
        System.out.println("TrackCoach: inside 'startupActivities' method");
    }

    public void cleanupActivities() {
        System.out.println("TrackCoach: inside 'cleanupActivities' method");
    }

}

