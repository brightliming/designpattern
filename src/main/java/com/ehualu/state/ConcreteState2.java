package com.ehualu.state;

/**
 * Created by bright on 16-7-6.
 */
public class ConcreteState2 extends State{
    @Override
    public void handle1() {
        this.context.setState(this.context.state1);
        this.context.handle1();
    }

    @Override
    public void handle2() {
        System.out.println("handle2 处理具体业务逻辑");
    }
}
