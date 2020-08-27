package com.gof.behavioral.command;

/**
 * The type Heading receiver.
 * Knows how to perform the operations associated with carrying out a request. Any class may serve as a Receiver.
 */
public class HeadingReceiver {

    /**
     * Left.
     */
    public void left() {
        System.out.println("Turn left the airplane heading");
    }

    /**
     * Right.
     */
    public void right() {
        System.out.println("Turn right the airplane heading");
    }
}
