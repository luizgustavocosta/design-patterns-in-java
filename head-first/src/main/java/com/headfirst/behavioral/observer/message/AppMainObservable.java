package com.headfirst.behavioral.observer.message;

import java.util.stream.Stream;

public class AppMainObservable {

    public static void main(String[] args) {
        MessagePublisher messagePublisher = new MessagePublisher();

        Observer alpha = new SubscriberAlpha();
        Observer beta = new SubscriberBeta();

        Stream.of(alpha, beta).forEach(messagePublisher::attach);

        messagePublisher.notifyUpdate(new Message("First message"));

        messagePublisher.detach(beta);

        messagePublisher.notifyUpdate(new Message("Second message"));
    }
}
