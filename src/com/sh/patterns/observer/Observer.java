package com.sh.patterns.observer;

/**
 * Created by ievgen on 5/18/14.
 */
public interface Observer<T> {
    void update(T...temp);
}
