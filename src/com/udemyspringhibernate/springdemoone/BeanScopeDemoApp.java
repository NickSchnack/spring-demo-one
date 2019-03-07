package com.udemyspringhibernate.springdemoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/udemyspringhibernate/springdemoone/beanScope-applicationContext.xml");

        // retrieve beans from the spring container
        Coach firstCoach = context.getBean("myCoach", Coach.class);
        Coach secondCoach = context.getBean("myCoach", Coach.class);

        // Compare the beans to see if they are the same
        boolean result = (firstCoach == secondCoach);
        System.out.println("Pointing to the same object: " + result);
        System.out.println("Memory location for 'firstCoach':  " + firstCoach);
        System.out.println("Memory location for 'secondCoach': " + secondCoach);

        // close the context
        context.close();
    }

}
