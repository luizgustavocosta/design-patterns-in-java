package com.gof.creational.factory_method;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * The type Word document test.
 */
class WordDocumentTest implements WithAssertions {

    /**
     * The Document.
     */
    Document document;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        document = new WordDocument();
    }

    /**
     * Rename.
     */
    @Test
    void rename() {
        final String newName = "FinalVersion.docx";
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
        final Throwable throwable = catchThrowable(() -> document.delete());
        assertThat(throwable).as("Expected a specific exception").isInstanceOf(UnsupportedOperationException.class);
    }

    /**
     * Share.
     */
    @Test
    void share() {
        String message = document.share(Collections.emptyList());
        assertThat(message).as("Expected template").contains("Hello Wor(l)d, now you're able to contribute on the document >>");
    }
}