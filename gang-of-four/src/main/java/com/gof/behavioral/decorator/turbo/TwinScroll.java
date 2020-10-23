package com.gof.behavioral.decorator.turbo;

import com.gof.behavioral.decorator.Engine;
import com.gof.behavioral.decorator.TurboCharger;

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
