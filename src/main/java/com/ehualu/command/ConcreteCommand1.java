package com.ehualu.command;

/**
 * Created by bright on 16-8-24.
 */
public class ConcreteCommand1 extends Command{

    private Receiver receiver;

    public ConcreteCommand1(Receiver _receiver){
        this.receiver = _receiver;
    }
    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
