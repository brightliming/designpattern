package com.ehualu.mediator;

/**
 * Created by bright on 16-8-24.
 */
public class ConcreteColleague1 extends Colleague{
    public ConcreteColleague1(Mediator _mediator) {
        super(_mediator);
    }

    public void selfMethod1(){
        System.out.println("do self method");
    }

    public void depMethod1(){
        super.mediator.doSomething1();
    }
}
