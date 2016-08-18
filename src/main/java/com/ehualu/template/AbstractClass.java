package com.ehualu.template;

/**
 * Created by bright on 16-8-18.
 */
public abstract class AbstractClass {
    protected abstract void doSomething();

    protected abstract  void doAnything();

    public  void templateMethod(){
        this.doAnything();
        this.doSomething();
    }
}
