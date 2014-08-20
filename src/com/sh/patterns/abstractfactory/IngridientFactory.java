package com.sh.patterns.abstractfactory;

/**
 * Created by ievgen on 7/10/14.
 */
//Abstract factory,passed via constructor to Pizza.
public interface IngridientFactory {
    Sauce createSouce();
    Cheese createCheese();
}
