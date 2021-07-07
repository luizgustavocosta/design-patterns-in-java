package com.gof.creational.singleton;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class MyService {

    public String random() {
        return UUID.randomUUID().toString().substring(0, 10);
    }
}
