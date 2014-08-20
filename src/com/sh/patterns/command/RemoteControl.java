package com.sh.patterns.command;

/**
 * Created by ievgen on 7/13/14.
 */
public class RemoteControl {
    private Command[] turnOnCommands;
    private Command[] turnOffCommands;
    private int position;
    private Command current;

    public RemoteControl(int num){
        turnOnCommands = new Command[num];
        turnOffCommands = new Command[num];
        NoCommand noCommand = new NoCommand();
        for (int i=0;i<num;i++){
            turnOnCommands[i] = noCommand;
            turnOffCommands[i] = noCommand;
        }
    }

    public void buttonOnPressed(){
        turnOnCommands[position].execute();
        current = turnOnCommands[position];
    }

    public void buttonOffPressed(){
        turnOffCommands[position].execute();
        current = turnOffCommands[position];
    }

    public void setCommand(int position, Command onCommand, Command offCommand){
        this.position = position;
        turnOnCommands[position] = onCommand;
        turnOffCommands[position] = offCommand;
    }

    public void undo(){
        current.undo();
    }

}
