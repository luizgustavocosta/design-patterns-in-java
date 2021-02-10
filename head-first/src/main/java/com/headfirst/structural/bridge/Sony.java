package com.headfirst.structural.bridge;

public class Sony implements TV {

    @Override
    public void on() {
        System.out.println(this.getClass().getSimpleName()+" on");
    }

    @Override
    public void off() {
        System.out.println(this.getClass().getSimpleName()+" off");
    }

    @Override
    public void tuneChannel(int number) {
        System.out.println(this.getClass().getSimpleName()+" tune channel to "+number);
    }
}
