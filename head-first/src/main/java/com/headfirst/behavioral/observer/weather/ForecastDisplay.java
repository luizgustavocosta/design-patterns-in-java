package com.headfirst.behavioral.observer.weather;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Logger;

public class ForecastDisplay implements Observer, DisplayElement {

    private final Logger logger = Logger.getLogger(ForecastDisplay.class.getName());

    private float currentPressure = 42.10f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        //FIXME - Pattern to remove if clause
        logger.info(() -> "Forecast: ");
        if (currentPressure > lastPressure) {
            logger.info(() -> "Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            logger.info(() -> "More of the same");
        } else if (currentPressure < lastPressure) {
            logger.info(() -> "Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(Observable observable, Object data) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
