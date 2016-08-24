package com.ehualu.mediator;

/**
 * Created by bright on 16-8-24.
 */
public class Client {
    public static void main(String[] args){
        Mediator mediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
        mediator.setC1(colleague1);
        mediator.setC2(colleague2);
        colleague1.depMethod1();

    }
}
