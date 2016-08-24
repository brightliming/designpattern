package com.ehualu.command;

/**
 * Created by bright on 16-8-24.
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }

}
