package com.gof.behavioral.visitor;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
class Team {

    private final String name;
    private final String uniformColor;
    private final List<Player> players;
}
