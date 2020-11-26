package com.gof.creational.singleton.spring;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MyServiceInSpring {

    public Long generateRandomNumber() {
        return ThreadLocalRandom.current().nextLong(0, 100);
    }

}
