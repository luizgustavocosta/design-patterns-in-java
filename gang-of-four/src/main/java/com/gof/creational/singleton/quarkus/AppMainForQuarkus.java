package com.gof.creational.singleton.quarkus;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class AppMainForQuarkus {

    public static void main(String[] args) {
        Quarkus.run(args);
    }
}
