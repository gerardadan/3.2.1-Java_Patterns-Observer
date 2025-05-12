package org.example;

/**
 * Main class to demonstrate the Observer design pattern.
 * This class creates a news channel (subject) and multiple users (observers),
 * and shows how users receive updates when the news channel publishes new news.
 */
public class Main {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();

        AirConditioningSystem ac = new AirConditioningSystem();
        AlarmSystem alarm = new AlarmSystem();
        DisplayPanel panel = new DisplayPanel();

        sensor.subscribe(ac);
        sensor.subscribe(alarm);
        sensor.subscribe(panel);

        sensor.setTemperature(25);
        sensor.setTemperature(30);
        sensor.setTemperature(19);
        sensor.setTemperature(15);
    }
}
