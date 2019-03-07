package com.udemyspringhibernate.springdemoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("com/udemyspringhibernate/springdemoone/applicationContext.xml");

        // retrieve bean from spring container
        Coach firstVolleyCoach = context.getBean("myCoach", Coach.class);
        Coach secondVolleyCoach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        //System.out.println(theCoach.getDailyWorkout());
        //System.out.println(theCoach.getDailyFortune());

        // determine if the coaches are the same
        boolean result = (firstVolleyCoach == secondVolleyCoach);
        System.out.println("The coaches are the same: " + result);
        System.out.println("Memory location for 'firstVolleyCoach':  " + firstVolleyCoach);
        System.out.println("Memory location for 'secondVolleyCoach': " + secondVolleyCoach);

        // close the context
        context.close();
    }

}

