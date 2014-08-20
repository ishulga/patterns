package com.sh.patterns.abstractfactory;

/**
 * Created by ievgen on 7/10/14.
 */
public class LAPizzaStore extends PizzaStore {
    private IngridientFactory ingridientFactory = new IngridientLAFactory();

    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new CheeseLAPizza(ingridientFactory);
        }else if(type.equals("pepperoni")){
            return new PepperoniPizza();
        }
        return null;
    }
}
