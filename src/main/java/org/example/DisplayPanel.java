package org.example;

public class DisplayPanel implements TemperatureObserver {

    @Override
    public void onTemperatureChanged(double temperature) {
        System.out.println("Panel: Mostrando temperatura actual: " + temperature + " ºC");
    }
}
