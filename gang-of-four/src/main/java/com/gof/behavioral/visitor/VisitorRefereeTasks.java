package com.gof.behavioral.visitor;

import java.time.LocalDateTime;
import java.util.List;

public interface VisitorRefereeTasks {

    void visit(Team home, Team away);

    void visit(LocalDateTime localDateTime);

    void visit(List<Player> players);
}
