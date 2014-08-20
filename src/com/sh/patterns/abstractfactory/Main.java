package com.sh.patterns.abstractfactory;

/**
 * Created by ievgen on 7/10/14.
 */
public class Main {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new LAPizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}
