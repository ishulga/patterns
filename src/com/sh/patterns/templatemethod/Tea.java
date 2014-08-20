package com.sh.patterns.templatemethod;

/**
 * Created by ievgen on 7/19/14.
 */
public class Tea extends Beverage {
    @Override
    public void brew() {
        System.out.println("Making tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Add lemon");
    }
}
