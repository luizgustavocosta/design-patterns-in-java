package com.headfirst.behavioral.observer.message;

import com.headfirst.behavioral.observer.weather.StatiticsDisplay;

import java.util.logging.Logger;

public class SubscriberAlpha implements Observer {

    private final Logger logger = Logger.getLogger(StatiticsDisplay.class.getName());

    @Override
    public void notifyUpdate(Message message) {
        logger.info(() -> "Alpha has been receive a message ->"+message);
    }
}
