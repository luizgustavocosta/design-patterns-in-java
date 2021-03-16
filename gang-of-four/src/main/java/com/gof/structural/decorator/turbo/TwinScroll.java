package com.gof.structural.decorator.turbo;

import com.gof.structural.decorator.Engine;
import com.gof.structural.decorator.TurboCharger;

import java.util.Collections;

/**
 * The type Twin scroll.
 */
public class TwinScroll extends TurboCharger {

    /**
     * Instantiates a new Twin scroll.
     *
     * @param engine the engine
     */
    protected TwinScroll(Engine engine) {
        super(engine, Collections.emptyList());
    }

    @Override
    public int horsePower() {
        return 0;
    }
}
