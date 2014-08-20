package com.sh.patterns.composite;

/**
 * Created by ievgen on 8/20/14.
 */
public class Waitress {
    private MenuComponent component;

    public Waitress(MenuComponent component){
        this.component = component;
    }

    public void print(){
        component.print();
    }
}
