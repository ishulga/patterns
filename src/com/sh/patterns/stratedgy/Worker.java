package com.sh.patterns.stratedgy;

/**
 * Created by ievgen on 5/18/14.
 */
public abstract class Worker {
    abstract void description();

    abstract void performJob();

    abstract void education();

    boolean isHuman(){
        return true;
    }
}
