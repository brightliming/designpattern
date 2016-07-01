package com.ehualu.observer;

/**
 * Created by bright on 16-7-1.
 */
public class ConcreteSubject extends Subject{
    public void doSomething(){
        super.notifyObservers();
    }
}
