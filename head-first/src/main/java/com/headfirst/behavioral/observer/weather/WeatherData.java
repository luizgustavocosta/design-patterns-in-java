package com.headfirst.behavioral.observer.weather;

import java.util.Observable;

/**
 * Only for learn. The best approach is use Flow
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    float getTemperature() {
        return temperature;
    }

    float getHumidity() {
        return this.humidity;
    }

    float getPressure() {
        return pressure;
    }

}
