package com.sh.patterns.fabricmethod;

/**
 * Created by ievgen on 7/10/14.
 */
public class LAPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new CheeseLAPizza();
        }else if(type.equals("pepperoni")){
            return new PepperoniPizza();
        }
        return null;
    }
}
