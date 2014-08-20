package com.sh.patterns.wrapper;

/**
 * Created by ievgen on 7/9/14.
 */
public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Mocha( new Espresso());
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}
