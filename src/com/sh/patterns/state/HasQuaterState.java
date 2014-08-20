package com.sh.patterns.state;

/**
 * Created by ievgen on 8/20/14.
 */
public class HasQuaterState implements State {
    private GumballMachine gumballMachine;

    public HasQuaterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void insertQuarter() {
        System.out.println("Can not insert another quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned ");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
