package com.gof.creational.prototype;


import java.util.UUID;

public class References {

    private final String id;
    private final String name;

    public References(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "References{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
