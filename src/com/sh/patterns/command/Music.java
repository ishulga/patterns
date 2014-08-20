package com.sh.patterns.command;

/**
 * Created by ievgen on 7/13/14.
 */
public class Music {
    public void turnOnMp3(){
        System.out.println("Turn ON mp3");
    }

    public void turnOffMp3(){
        System.out.println("Turn OFF mp3");
    }

    public void shutDown(){
        System.out.println("Shut down device");
    }

    public void prepareDisk(){
        System.out.println("Prepare Disk");
    }

    public void turnOnMusic(){
        System.out.println("Turn ON music");
    }
}
