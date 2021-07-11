package com.gof.behavioral.visitor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.time.ZonedDateTime;

@Builder
@Data
public class Player {

    private final String id;
    private final String firstName;
    private final String lastName;
    private final int number;
    private final ZonedDateTime dob;
}
