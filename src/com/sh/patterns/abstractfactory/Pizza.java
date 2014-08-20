package com.sh.patterns.abstractfactory;

/**
 * Created by ievgen on 7/10/14.
 */
public abstract class Pizza {
    public void bake(){}
    public abstract void fill();
    public abstract void createSauce();
    public abstract void createCheese();

}
