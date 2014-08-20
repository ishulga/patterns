package com.sh.patterns.templatemethod;

/**
 * Created by ievgen on 7/19/14.
 */
public class Cofee extends Beverage {
    @Override
    public void brew() {
        System.out.println("Making Cofee");
    }

    @Override
    public void addCondiments() {
        System.out.println("Add cream and sugar");
    }

    @Override
    public boolean customerWants() {
        return false;
    }
}
