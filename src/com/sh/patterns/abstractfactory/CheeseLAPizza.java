package com.sh.patterns.abstractfactory;

/**
 * Created by ievgen on 7/10/14.
 */
public class CheeseLAPizza extends Pizza {
    private IngridientFactory ingridientFactory;

    public CheeseLAPizza(IngridientFactory ingridientFactory){
        this.ingridientFactory = ingridientFactory;
    }

    @Override
    public void fill() {
        System.out.println("fill like in LA");
    }

    @Override
    public void createSauce() {
        ingridientFactory.createSouce();
    }

    @Override
    public void createCheese() {
    ingridientFactory.createCheese();
    }
}
