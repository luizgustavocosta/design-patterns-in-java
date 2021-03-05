package com.gof.structural.composite;

public enum CountryAlphaCode {

    AR("Argentina"),
    BR("Brazil"),
    DE("Germany"),
    ES("Spain"),
    US("United States of America");

    String name;

    CountryAlphaCode(String name) {
        this.name = name;
    }
}
