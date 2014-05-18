package com.sh.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ievgen on 5/18/14.
 */
public class WeatherData implements Subject<Integer> {
    private int temp;
    private int degree;
    private List<Observer<Integer>> observers = new ArrayList<Observer<Integer>>();
    @Override
    public void registerObserver(Observer<Integer> observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer<Integer> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        int i=0;
        for (Observer<Integer> observer :observers){
            i++;
            observer.update(temp,degree);
        }
        System.out.println(i+" observers are notified");
    }

    public void setNewData(int temp,int degree){
        this.temp = temp;
        this.degree = degree;
    }
}
