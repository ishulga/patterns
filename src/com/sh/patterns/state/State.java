package com.sh.patterns.state;

/**
 * Created by ievgen on 8/20/14.
 */
public interface State {

    void ejectQuarter();

    void insertQuarter();

    void turnCrank();

    void dispense();

}
