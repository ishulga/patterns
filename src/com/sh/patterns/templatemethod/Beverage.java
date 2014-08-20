package com.sh.patterns.templatemethod;

/**
 * Created by ievgen on 7/19/14.
 */
public abstract class Beverage {

    public void boilWater(){
        System.out.println("Boil the water");
    }

    public void pourInCup(){
        System.out.println("Pour in the cup");
    }

    public abstract void brew();
    public abstract void addCondiments();

    public void prepareDrink(){
        boilWater();
        brew();
        pourInCup();
        if(customerWants()) {
            addCondiments();
        }
    }

    public boolean customerWants() {
        return true;
    }
}
