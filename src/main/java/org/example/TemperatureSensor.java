package org.example;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor implements TemperatureSensorSubject {
    private List<TemperatureObserver> observers = new ArrayList<>();
    private double currentTemperature;

    public void setTemperature(double temperature) {
        System.out.println("Sensor: Nueva temperatura registrada: " + temperature + " ºC");
        this.currentTemperature = temperature;
        notifyObservers();
    }

    @Override
    public void subscribe(TemperatureObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(TemperatureObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (TemperatureObserver observer : observers) {
            observer.onTemperatureChanged(currentTemperature);
        }
    }
}
