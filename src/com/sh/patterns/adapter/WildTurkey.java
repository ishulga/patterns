package com.sh.patterns.adapter;

/**
 * Created by ievgen on 7/13/14.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gooble() {
        System.out.println("Turkey is goobling");
    }

    @Override
    public void fly() {
        System.out.println("Turkey is flying");
    }
}
