package com.gof.creational.abstract_factory.license;

public interface License {
    String name();

    String expiration();

    default String print() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nAttention");
        builder.append("\nThis software is under the " + name() + " license");
        builder.append("\nThe expiration will be " + expiration());
        return builder.toString();
    }
}
