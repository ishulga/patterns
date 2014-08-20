package com.sh.patterns.abstractfactory;

/**
 * Created by ievgen on 7/10/14.
 */
public class NYPizzaStore extends PizzaStore {
    private IngridientFactory ingridientNYFactory = new IngridientNYFactory();

    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new CheeseNYPizza(ingridientNYFactory);
        }else if(type.equals("pepperoni")){
            return new PepperoniPizza();
        }
        return null;
    }
}
