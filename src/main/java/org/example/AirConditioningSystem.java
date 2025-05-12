package org.example;

public class AirConditioningSystem implements TemperatureObserver{
    @Override
    public void onTemperatureChanged(double temperature) {
        if(temperature > 25)
            System.out.println("Activando modo aire acondicionado");
        else if(temperature < 18)
            System.out.println("Activando modo calefacción");
        else
            System.out.println("Temperatura correcta");
    }
}
