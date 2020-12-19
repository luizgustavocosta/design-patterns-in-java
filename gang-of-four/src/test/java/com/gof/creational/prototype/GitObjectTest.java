package com.gof.creational.prototype;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GitObjectTest implements WithAssertions {

    @DisplayName("Prototype of GitObject")
    @Test
    void whenAPrototypeIsRequestThenClone() {
        GitObject gitObject = new GitObject();
        final GitObject prototype = gitObject.prototype();
        assertThat(gitObject).as("The objects should be equals").isEqualToComparingFieldByField(prototype);
    }
}