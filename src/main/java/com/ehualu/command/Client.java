package com.ehualu.command;

/**
 * Created by bright on 16-8-24.
 */
public class Client {
    public static void main(String[] args){
        Invoker invoker = new Invoker();

        Receiver receiver = new ConcreteReceiver1();

        Command command = new ConcreteCommand1(receiver);

        invoker.setCommand(command);

        invoker.action();
    }
}
