package com.sh.patterns.command;

/**
 * Created by ievgen on 7/13/14.
 *
 * Command encapsulates request in Command object.
 *
 * Commands queue is used in thread pools, queue tasks.
 *
 * For commands queue store() and load() methods can be added to provide fail-safe mode.
 *
 * After command execution list of commands store on file system, in case of failing commands,
 * command load fom system and executes again.
 *
 * Set of commands can be included in transaction.
 *
 */
public interface Command {
    void execute();

    void undo();
}
