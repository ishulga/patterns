package com.sh.patterns.observer;

/**
 * Created by ievgen on 5/18/14.
 */
public class HomeConditions implements Observer<Integer> {
    private Subject weatherData;
    private int temp;
    private int degree;

    public HomeConditions(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(Integer[] incomObjects) {
        temp = incomObjects[0];
        degree = incomObjects[1];
        show();
    }

    private void show() {
        System.out.println();
        System.out.printf("%s updated with temp %s and degree %s",getClass().getSimpleName(),temp,degree);
    }
}
