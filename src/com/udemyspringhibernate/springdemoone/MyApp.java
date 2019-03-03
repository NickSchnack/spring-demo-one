package com.udemyspringhibernate.springdemoone;

public class MyApp {

    public static void main(String[] args) {

        // Create the Spring container


        // create the object
        Coach theCoach = new TrackCoach();

        // use the object
        System.out.println(theCoach.getDailyWorkout());

    }

}

