package com.sh.patterns.fabricmethod;

/**
 * Created by ievgen on 7/10/14.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.fill();
        pizza.bake();
        return pizza;
    }
    //fabric method
    //delegates creation to subclasses
    protected abstract Pizza createPizza(String type);
}
