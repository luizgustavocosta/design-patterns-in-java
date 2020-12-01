package com.gof.creational.factory_method;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * The interface Time handler.
 */
public interface TimeHandler {

    /**
     * Now in string format string.
     *
     * @return the string
     */
    default String nowInStringFormat() {
        return now().toString();
    }

    /**
     * Now zoned date time.
     *
     * @return the zoned date time
     */
    default ZonedDateTime now() {
        return ZonedDateTime.now(ZoneId.of("UTC"));
    }

    /**
     * Now zoned date time.
     *
     * @param zoneId the zone id
     * @return the zoned date time
     */
    default ZonedDateTime now(ZoneId zoneId) {
        return ZonedDateTime.now(zoneId);
    }
}
