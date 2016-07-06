package com.ehualu.state;

/**
 * Created by bright on 16-7-6.
 */
public class Client {
    public static void main(String[] args){
        Context context = new Context();
        context.setState(new ConcreteState1());

        context.handle1();
        context.handle2();
        context.handle1();
    }
}
