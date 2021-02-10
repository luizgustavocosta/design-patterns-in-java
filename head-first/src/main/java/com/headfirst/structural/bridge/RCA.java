package com.headfirst.structural.bridge;

public class RCA extends TV{
    @Override
    void on() {
        System.out.println(this.getClass().getSimpleName()+" on");
    }

    @Override
    void off() {
        System.out.println(this.getClass().getSimpleName()+" off");
    }

    @Override
    void tuneChannel(int number) {
        System.out.println(this.getClass().getSimpleName()+" tune channel to "+number);
    }
}
