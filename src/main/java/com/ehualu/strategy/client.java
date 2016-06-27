package com.ehualu.strategy;

/**
 * Created by bright on 16-6-27.
 */
public class client {
    public static void main(String[] args){
        IStrategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);

        context.doAnything();
    }
}
