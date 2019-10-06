package com.gof.behavioral.strategy.client;

import com.gof.behavioral.strategy.model.TVChannel;
import com.gof.behavioral.strategy.printer.PrinterStrategy;

/**
 * The interface Context.
 */
public interface Context {

    /**
     * Define strategy.
     *
     * @param strategy the strategy
     */
    void defineStrategy(PrinterStrategy strategy);

    /**
     * Print string.
     *
     * @param tvChannel the tv channel
     * @return the string
     */
    String print(TVChannel tvChannel);
}
