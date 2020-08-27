package com.gof.behavioral.command;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class HeadingLeftShould {

    @Mock
    HeadingReceiver receiver;

    @BeforeAll
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void callTheReceiver() {
        HeadingRight headingRight = new HeadingRight(receiver);
        headingRight.execute();
        verify(receiver, times(0)).left();
        verify(receiver, times(1)).right();
    }
}