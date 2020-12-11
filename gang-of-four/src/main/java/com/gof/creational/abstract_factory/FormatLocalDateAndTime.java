package com.gof.creational.abstract_factory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Objects;

public class FormatLocalDateAndTime {

    private FormatLocalDateAndTime() {
        throw new UnsupportedOperationException();
    }

    public static String format(LocalDateTime localDateTime) {
        Objects.requireNonNull(localDateTime);
        String pattern = "EEEE, dd MMMM yyyy 'at' HH:mm";
        Locale locale = Locale.ENGLISH;
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern, locale);
        return dateTimeFormatter.format(localDateTime);
    }
}
