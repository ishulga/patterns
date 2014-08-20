package com.sh.patterns.wrapper;

/**
 * Created by ievgen on 7/9/14.
 */
public class Mocha extends CondimentBeverage {
    private Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    String getDescription() {
        return beverage.getDescription()+ " Mocha";
    }

    @Override
    double cost() {
        return 0.19 +beverage.cost();
    }
}
