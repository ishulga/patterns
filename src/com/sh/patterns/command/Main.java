package com.sh.patterns.command;

/**
 * Created by ievgen on 7/13/14.
 */
public class Main {
    public static void main(String[] args) {
        Music music = new Music();
        MusicOnCommand musicOnCommand = new MusicOnCommand(music);
        MusicOffCommand musicOffCommand = new MusicOffCommand(music);

        RemoteControl remoteControl = new RemoteControl(5);
        remoteControl.setCommand(1,musicOnCommand,musicOffCommand);

        remoteControl.buttonOnPressed();
        remoteControl.buttonOffPressed();
        remoteControl.undo();
    }
}
