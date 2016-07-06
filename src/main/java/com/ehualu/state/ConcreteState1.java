package com.ehualu.state;

/**
 * Created by bright on 16-7-6.
 */
public class ConcreteState1 extends State{
    @Override
    public void handle1() {
        System.out.println("handle1 处理具体业务逻辑");
    }

    @Override
    public void handle2() {
        this.context.setState(this.context.state2);
        this.context.handle2();
    }
}
