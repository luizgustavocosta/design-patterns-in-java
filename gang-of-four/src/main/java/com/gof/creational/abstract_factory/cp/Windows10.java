package com.gof.creational.abstract_factory.cp;

import com.gof.creational.abstract_factory.ap.OperationalSystem;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Windows10 implements OperationalSystem {

    @Override
    public List<String> writtenIn() {
        return Stream.of(
                "C, C++, C#".split(","))
                .collect(Collectors.toList());
    }

    @Override
    public List<String> osFamily() {
        return Collections.singletonList("Microsoft Windows");
    }

    @Override
    public LocalDate initialReleaseDate() {
        return LocalDate.of(2015, Month.JULY, 29);
    }

    @Override
    public String sourceModel() {
        return
                "Closed-source\n" +
                        "Source-available (through Shared Source Initiative)\n" +
                        "some components open source";
    }
}
