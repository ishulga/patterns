package com.sh.patterns.command;

/**
 * Created by ievgen on 7/13/14.
 */
public class MusicOffCommand implements Command {
    private Music music;

    public MusicOffCommand(Music music) {
        this.music = music;
    }

    @Override
    public void execute() {
        music.turnOffMp3();
        music.shutDown();
    }

    @Override
    public void undo() {
        music.prepareDisk();
        music.turnOnMusic();
        music.turnOnMp3();
    }
}
