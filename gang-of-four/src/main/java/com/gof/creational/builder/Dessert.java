package com.gof.creational.builder;

public class Dessert {

    private Size size;
    private String name;

    public Dessert(Size size, String name) {
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
        return "Dessert{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
