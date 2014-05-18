package com.sh.patterns.observer;

/**
 * Created by ievgen on 5/18/14.
 */
public interface Subject<T> {
    void  registerObserver(Observer<T> observer);
    void removeObserver(Observer<T> observer);
    void notifyObservers();
}
