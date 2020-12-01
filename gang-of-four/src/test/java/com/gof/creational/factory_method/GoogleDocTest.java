package com.gof.creational.factory_method;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * The type Google doc test.
 */
class GoogleDocTest implements WithAssertions {

    /**
     * The Document.
     */
    Document document;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        document = new GoogleDoc();
    }

    /**
     * Rename.
     */
    @Test
    void rename() {
        final Throwable throwable = assertThrows(UnsupportedOperationException.class, () -> document.rename("Beauty name"));
        assertThat(throwable.getMessage()).as("Expected messages").isEqualTo("Unsupported");
    }

    /**
     * Delete.
     */
    @Test
    void delete() {
        final Throwable throwable = catchThrowable(() -> document.delete());
        assertThat(throwable).as("Expected a kind of exception").isInstanceOf(UnsupportedOperationException.class);
    }

    /**
     * Share.
     */
    @Test
    void share() {
        String message = document.share(Collections.emptyList());
        assertThat(message).as("Expected template").contains(" now is shared with you");
    }
}