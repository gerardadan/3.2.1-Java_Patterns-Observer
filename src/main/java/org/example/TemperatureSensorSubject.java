package org.example;

public interface TemperatureSensorSubject {
    void subscribe(TemperatureObserver observer);
    void unsubscribe(TemperatureObserver observer);
    void notifyObservers();
}
