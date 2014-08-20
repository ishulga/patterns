package com.sh.patterns.state;

/**
 * Created by ievgen on 8/20/14.
 */
public class SoldState implements State {
    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Already turned the crunk");
    }

    @Override
    public void insertQuarter() {
        System.out.println("Wait, giving a ball");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned ");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() >0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else{
            gumballMachine.setState(gumballMachine.getSoldOutState());
            System.out.println("Opps, out of balls");
        }
    }
}
