package com.ehualu.mediator;

/**
 * Created by bright on 16-8-24.
 */
public class ConcreteMediator extends Mediator{
    @Override
    public void doSomething1() {
        super.c1.selfMethod1();
        super.c2.doSelfMethod2();
    }

    @Override
    public void doSomething2() {
        super.c1.selfMethod1();
        super.c2.doSelfMethod2();
    }
}
