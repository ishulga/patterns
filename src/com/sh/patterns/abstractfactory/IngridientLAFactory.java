package com.sh.patterns.abstractfactory;

/**
 * Created by ievgen on 7/10/14.
 */
public class IngridientLAFactory implements IngridientFactory {
    @Override
    public Sauce createSouce() {
        return new Sauce();
    }

    @Override
    public Cheese createCheese() {
        return new Cheese();
    }
}
