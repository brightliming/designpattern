package com.ehualu.strategy;

/**
 * Created by bright on 16-6-27.
 */
public class Context {
    private IStrategy strategy = null;
    public Context(IStrategy _strategy){
        this.strategy = _strategy;
    }
    public void doAnything(){
        this.strategy.doSomething();
    }
}
