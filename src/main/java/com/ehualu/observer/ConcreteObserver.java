package com.ehualu.observer;

/**
 * Created by bright on 16-7-1.
 */
public class ConcreteObserver implements Observer{
    public void update() {
        System.out.println("接受到信息，并进行处理！");
    }
}
