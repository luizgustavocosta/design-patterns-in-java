package com.gof.creational.builder;

public class Beverage {

    private Size size;
    private String name;

    public Beverage(Size size, String name) {
        this.size = size;
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Beverage{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
