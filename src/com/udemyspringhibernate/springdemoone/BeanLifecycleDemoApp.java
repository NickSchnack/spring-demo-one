package com.udemyspringhibernate.springdemoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/udemyspringhibernate/springdemoone/beanLifecycle-applicationContext.xml");

        // retrieve beans from the spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // do something with the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }

}
