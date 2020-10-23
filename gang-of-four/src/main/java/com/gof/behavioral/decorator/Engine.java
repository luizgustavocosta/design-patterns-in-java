package com.gof.behavioral.decorator;

import java.util.List;

/**
 * The type Engine.
 */
public abstract class Engine {

    /**
     * The Horse power.
     */
    protected final int horsePower;

    /**
     * Instantiates a new Engine.
     *
     * @param horsePower the horse power
     */
    protected Engine(int horsePower) {
        this.horsePower = horsePower;
    }

    /**
     * Accepted by list.
     *
     * @return the list
     */
    public abstract List<EngineType> acceptedBy();

    /**
     * Horse power int.
     *
     * @return the int
     */
    public abstract int horsePower();
}

