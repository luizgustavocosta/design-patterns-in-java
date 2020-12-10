package com.gof.creational.abstract_factory.license;

import com.gof.creational.abstract_factory.FormatLocalDateAndTime;

import java.time.LocalDateTime;

public class Paid implements License {

    @Override
    public String name() {
        return "Paid";
    }

    @Override
    public String expiration() {
        return FormatLocalDateAndTime.format(LocalDateTime.now());
    }
}
