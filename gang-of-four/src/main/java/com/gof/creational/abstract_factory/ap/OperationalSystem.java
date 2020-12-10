package com.gof.creational.abstract_factory.ap;

import java.time.LocalDate;
import java.util.List;

public interface OperationalSystem {

    List<String> writtenIn();

    List<String> osFamily();

    LocalDate initialReleaseDate();

    String sourceModel();

    default String releaseNotes() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nThank you by order the new "+osFamily());
        builder.append("\nThis computer has the OS written in "+writtenIn());
        builder.append("\nOS source model => "+sourceModel());
        builder.append("\nHistory.....");
        builder.append("\nThis first version of this OS was launched in "+initialReleaseDate());
        return builder.toString();
    }

}
