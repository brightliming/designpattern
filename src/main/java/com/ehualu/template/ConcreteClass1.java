package com.ehualu.template;

/**
 * Created by bright on 16-8-18.
 */
public class ConcreteClass1 extends AbstractClass{
    @Override
    protected void doSomething() {
        System.out.println("doSomething1");
    }

    @Override
    protected void doAnything() {
        System.out.println("doAnyting1");
    }
}
