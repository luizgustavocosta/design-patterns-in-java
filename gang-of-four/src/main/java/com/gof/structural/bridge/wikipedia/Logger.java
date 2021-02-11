package com.gof.structural.bridge.wikipedia;

// Refined abstraction
@FunctionalInterface
interface Logger {
    static Logger info() {
        return message -> System.out.println("info: " + message);
    }

    static Logger warning() {
        return message -> System.out.println("warning: " + message);
    }

    void log(String message);
}
