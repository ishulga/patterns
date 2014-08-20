package com.sh.patterns.adapter;

/**
 * Created by ievgen on 7/13/14.
 */
public class MallardDuck implements Duck {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void quack() {
        System.out.println("Duck is quacking");
    }
}
