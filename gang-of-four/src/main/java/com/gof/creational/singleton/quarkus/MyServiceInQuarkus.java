package com.gof.creational.singleton.quarkus;


import javax.inject.Singleton;
import java.util.concurrent.ThreadLocalRandom;

@Singleton
//@Dependent
public class MyServiceInQuarkus {

    public Long generateRandomNumber() {
        return ThreadLocalRandom.current().nextLong(101, 200);
    }
}
