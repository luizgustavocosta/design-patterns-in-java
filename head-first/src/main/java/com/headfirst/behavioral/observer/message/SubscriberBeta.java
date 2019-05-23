package com.headfirst.behavioral.observer.message;

import java.util.logging.Logger;

public class SubscriberBeta implements Observer {

    private final Logger logger = Logger.getLogger(SubscriberBeta.class.getName());

    @Override
    public void notifyUpdate(Message message) {
        logger.info(() -> "Beta has been receive a message ->"+message);
    }
}
