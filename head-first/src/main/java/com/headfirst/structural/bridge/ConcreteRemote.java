package com.headfirst.structural.bridge;

public class ConcreteRemote implements RemoteControl {

    private final TV tv;

    public ConcreteRemote(TV tv) {
        this.tv = tv;
    }


    @Override
    public void on() {
        tv.on();
    }

    @Override
    public void off() {
        tv.off();
    }

    @Override
    public void setChannel(int number) {
        tv.tuneChannel(number);
    }
}
