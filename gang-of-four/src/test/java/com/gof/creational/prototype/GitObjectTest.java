package com.gof.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GitObjectTest {

    @Test
    void addCommit() {

        GitObject gitObject = new GitObject();
        System.out.println(gitObject);
        final Object prototype = gitObject.prototype();
        System.out.println(prototype);

    }
}