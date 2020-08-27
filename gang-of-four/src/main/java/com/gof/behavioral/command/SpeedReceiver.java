package com.gof.behavioral.command;


/**
 * The type SpeedReceiver.
 * Knows how to perform the operations associated with carrying out a request. Any class may serve as a Receiver.
 */
public class SpeedReceiver {

    /**
     * Increase.
     */
    public void increase() {
        System.out.println("Increasing the speed..go nuts!");
    }

    /**
     * Decrease.
     */
    public void decrease() {
        System.out.println("Decreasing the speed..piece of cake");
    }
}
