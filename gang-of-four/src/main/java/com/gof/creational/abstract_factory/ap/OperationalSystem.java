package com.gof.creational.abstract_factory.ap;

import java.time.LocalDate;
import java.util.List;

public interface OperationalSystem {

    List<String> writtenIn();

    List<String> osFamily();

    LocalDate initialReleaseDate();

    String sourceModel();

    default String releaseNotes() {
        return new StringBuilder()
                .append("\nThank you by order the new " + osFamily())
                .append("\nThis computer has the OS written in " + writtenIn())
                .append("\nOS source model => " + sourceModel())
                .append("\nHistory.....")
                .append("\nThis first version of this OS was launched in " + initialReleaseDate())
                .toString();
    }

}
