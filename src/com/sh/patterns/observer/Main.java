package com.sh.patterns.observer;

/**
 * Created by ievgen on 5/18/14.
 */
public class Main {
    public static void main(String[] args) {
        Subject weatherData = new WeatherData();
        new HomeConditions(weatherData);
        new WorkConditions(weatherData);
        weatherData.notifyObservers();
    }
}
