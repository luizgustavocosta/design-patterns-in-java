package com.headfirst.behavioral.observer.weather;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Logger;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private final Logger logger = Logger.getLogger(CurrentConditionsDisplay.class.getName());
    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object data) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        logger.info(() ->
                "Current conditions: " + temperature +"C degrees and " + humidity + "% humidity");
    }
}
