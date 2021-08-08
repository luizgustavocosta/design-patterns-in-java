package com.gof.structural.proxy;

import lombok.Builder;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

@Data
@Builder
public class AccountDetails {

    private final String iban;
    private final List<String> owners;
    private final ZonedDateTime memberSince;
    private final boolean active;

}
