package com.sh.patterns.adapter;

/**
 * Created by ievgen on 7/13/14.
 */
public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        testDuck(duck);
        testDuck(turkeyAdapter);
    }
    public static void testDuck(Duck duck){
        duck.fly();
        duck.quack();
    }
}
