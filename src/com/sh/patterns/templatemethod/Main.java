package com.sh.patterns.templatemethod;

/**
 * Created by ievgen on 7/19/14.
 */
public class Main {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        tea.prepareDrink();

        Beverage coffee = new Cofee();
        coffee.prepareDrink();
    }
}
