package com.ehualu.mediator;

/**
 * Created by bright on 16-8-24.
 */
public class ConcreteColleague2 extends Colleague{
    public ConcreteColleague2(Mediator _mediator) {
        super(_mediator);
    }

    public void doSelfMethod2(){
        System.out.println("do self method2");
    }

    public void depMethod2(){
        super.mediator.doSomething2();
    }
}
