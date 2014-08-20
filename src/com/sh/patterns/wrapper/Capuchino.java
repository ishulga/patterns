package com.sh.patterns.wrapper;

/**
 * Created by ievgen on 7/9/14.
 */
public class Capuchino extends Beverage {
    @Override
    String getDescription() {
        return "Capuchino";
    }

    @Override
    double cost() {
        return 1.29;
    }
}
