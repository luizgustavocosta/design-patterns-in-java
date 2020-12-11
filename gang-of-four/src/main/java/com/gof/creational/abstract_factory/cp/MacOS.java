package com.gof.creational.abstract_factory.cp;

import com.gof.creational.abstract_factory.ap.OperationalSystem;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MacOS implements OperationalSystem {

    public List<String> writtenIn() {
        return Stream.of(
                "C, C++, Objective-C, Swift, Assembly language".split(","))
                .collect(Collectors.toList());
    }

    public List<String> osFamily() {
        return Stream.of("MacOS, Macintosh operating systems".split(",")).collect(Collectors.toList());
    }

    public LocalDate initialReleaseDate() {
        return LocalDate.of(2001, Month.MARCH, 24);
    }

    public String sourceModel() {
        return "Closed source (with open source components)";
    }
}
