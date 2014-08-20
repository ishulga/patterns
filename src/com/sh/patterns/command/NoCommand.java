package com.sh.patterns.command;

/**
 * Created by ievgen on 7/13/14.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("No command was specified");
    }

    @Override
    public void undo() {
        System.out.println("No command was specified");
    }
}
