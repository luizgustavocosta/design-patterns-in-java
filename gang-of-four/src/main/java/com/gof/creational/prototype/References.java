package com.gof.creational.prototype;


import java.util.UUID;

public class References implements Prototype {

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
    public References prototype() {
        try {
            return (References) this.clone();
        } catch (CloneNotSupportedException e) {
            throw new UnsupportedOperationException("Prototype not supported.");
        }
    }

    @Override
    public String toString() {
        return "References{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
