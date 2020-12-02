package com.gof.creational.factory_method;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * The type My application test.
 */
@DisplayName("Factory method test")
class MyApplicationTest implements WithAssertions {

    /**
     * For each type stream.
     *
     * @return the stream
     */
    static Stream<Arguments> forEachType() {
        return Stream.of(
                Arguments.arguments(CloudDocumentProvider.APPLE, PagesDocument.class),
                Arguments.arguments(CloudDocumentProvider.GOOGLE, GoogleDoc.class),
                Arguments.arguments(CloudDocumentProvider.MICROSOFT, WordDocument.class));
    }

    /**
     * Gets document.
     *
     * @param type  the type
     * @param clazz the clazz
     */
    @ParameterizedTest
    @DisplayName("Create documents")
    @MethodSource("forEachType")
    void getDocument(CloudDocumentProvider type, Class clazz) {
        MyApplication myApplication = new MyApplication();
        final Document document = myApplication.factoryMethod(type);
        assertThat(document).as("Should be an instance of " + clazz.getName()).isInstanceOf(clazz);
    }

}