package com.sh.patterns.wrapper;

/**
 * Created by ievgen on 7/9/14.
 */
public class Espresso extends Beverage{
    @Override
    String getDescription() {
        return "Espresso";
    }

    @Override
    double cost() {
        return 0.99;
    }
}
