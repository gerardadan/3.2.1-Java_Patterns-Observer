package org.example;

public class AlarmSystem implements TemperatureObserver{

    @Override
    public void onTemperatureChanged(double temperature) {
        if(temperature < -10 || temperature > 30) {
            System.out.println("Alarma activada");
        }
    }
}
