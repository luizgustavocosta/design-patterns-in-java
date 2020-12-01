package com.gof.creational.factory_method;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * The type Pages document test.
 */
class PagesDocumentTest implements WithAssertions {

    /**
     * The Document.
     */
    Document document;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        document = new PagesDocument();
    }

    /**
     * Rename.
     */
    @Test
    void rename() {
        final String newName = "Report.pages";
        final DocumentAttributes documentAttributes = document.rename(newName);
        assertAll(() -> {
            assertThat(documentAttributes.getName()).as("The name should be equals").isEqualTo(newName);
            assertThat(documentAttributes.getSize()).as("Should be greater than 0").isGreaterThan(0L);
            assertThat(documentAttributes.getLastModified()).as("Last modified has value").isNotEmpty();
        });
    }

    /**
     * Delete.
     */
    @Test
    void delete() {
        final Throwable throwable = assertThrows(IllegalStateException.class, () -> document.delete());
        assertThat(throwable.getMessage()).as("Expected message").isEqualTo("Documents in this format are not deletable");
    }

    /**
     * Share.
     */
    @Test
    void share() {
        String message = document.share(Collections.emptyList());
        assertThat(message).as("Expected empty").isEmpty();
    }
}