package com.sh.patterns.command;

/**
 * Created by ievgen on 7/13/14.
 */
public class MusicOnCommand implements Command {
    private Music music;

    public MusicOnCommand(Music music){
        this.music = music;
    }

    @Override
    public void execute() {
        music.prepareDisk();
        music.turnOnMp3();
        music.turnOnMusic();
    }

    @Override
    public void undo() {
        music.turnOffMp3();
        music.shutDown();
    }
}
