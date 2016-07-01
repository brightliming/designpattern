package com.ehualu.observer;

/**
 * Created by bright on 16-7-1.
 */
public class Client {
    public static void main(String[] args){
        ConcreteSubject subject = new ConcreteSubject();
        Observer obs = new ConcreteObserver();
        subject.addObserver(obs);

        subject.doSomething();
    }
}
