package com.sh.patterns.wrapper;

/**
 * Created by ievgen on 7/9/14.
 */
public class Cacao extends CondimentBeverage {
    private Beverage beverage;

    public Cacao(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    String getDescription() {
        return beverage.getDescription()+ " Cacao";
    }

    @Override
    double cost() {
        return 0.14 +beverage.cost();
    }
}
