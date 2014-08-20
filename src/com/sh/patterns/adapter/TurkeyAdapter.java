package com.sh.patterns.adapter;

/**
 * Created by ievgen on 7/13/14.
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void fly() {
        turkey.fly();
    }

    @Override
    public void quack() {
        turkey.gooble();
    }
}
