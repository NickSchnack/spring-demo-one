package com.udemyspringhibernate.springdemoone;

import java.util.Random;

public class RandomFortuneService implements FortuneService{

    private String[] fortuneArray = {
            "Today is your lucky day!",
            "Something great is about to happen!",
            "You will learn something awesome this week!"
    };

    @Override
    public String getFortune() {
        return getRandomFortune();
    }

    private String getRandomFortune() {
        Random random = new Random();
        int index = random.nextInt(fortuneArray.length);
        return fortuneArray[index];
    }

}

