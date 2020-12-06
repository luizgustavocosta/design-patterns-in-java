package com.gof.creational.factory_method;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.EnumSet;

/**
 * The type Cloud document provider test.
 */
@DisplayName("Enum test")
class CloudDocumentProviderTest implements WithAssertions {

    /**
     * Find the value in enum.
     *
     * @param cloudDocumentProvider the cloud document provider
     */
    @ParameterizedTest(name = "#{index} - Enum CloudDocumentProvider contains {0} ?")
    @EnumSource(value = CloudDocumentProvider.class, names = {"APPLE", "GOOGLE", "MICROSOFT"})
    void findTheValueInEnum(CloudDocumentProvider cloudDocumentProvider) {
        assertThat(EnumSet.allOf(CloudDocumentProvider.class)).as("Is expected a valor for " + cloudDocumentProvider)
                .contains(cloudDocumentProvider);
    }

}