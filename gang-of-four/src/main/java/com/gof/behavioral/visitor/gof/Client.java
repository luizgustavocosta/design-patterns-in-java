package com.gof.behavioral.visitor.gof;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class Client {

    private static Element element;
    private static Visitor visitor;

    public static void main(String[] args) {
        //1
        element = new ConcreteElement1("ACB", 42);
        visitor = new ConcreteVisitor1();

        element.accept(visitor);

        //N
        element = new ConcreteElementN(LocalDateTime.of(
                LocalDate.ofYearDay(2004, 1),
                LocalTime.NOON
        ));
        visitor = new ConcreteVisitorN();
        element.accept(visitor);
    }

}
