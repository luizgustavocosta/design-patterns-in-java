package com.gof.structural.bridge.wikipedia;

// Refined abstraction
@FunctionalInterface
interface Logger {
    void log(String message);

    static Logger info() {
        return message -> System.out.println("info: " + message);
    }
    static Logger warning() {
        return message -> System.out.println("warning: " + message);
    }
}
