package com.headfirst.behavioral.observer.weather;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Logger;

public class StatiticsDisplay implements Observer, DisplayElement {

    private final Logger logger = Logger.getLogger(StatiticsDisplay.class.getName());
    private float maxTemperature    = 0.0f;
    private float minTemperature    = 200;
    private float tempSum           = 0.0f;
    private int numberOfReadings;

    public StatiticsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    public void display() {
        logger.info(() -> "Avg/Max/Min temperature = " +
                (tempSum / numberOfReadings) + "/" + maxTemperature + "/" + minTemperature);
    }

    @Override
    public void update(Observable observable, Object data) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            float temp = weatherData.getTemperature();
            tempSum += temp;
            numberOfReadings++;
            if (temp > maxTemperature) {
                maxTemperature = temp;
            }
            if (temp < minTemperature) {
                minTemperature = temp;
            }
            display();
        }
    }
}
