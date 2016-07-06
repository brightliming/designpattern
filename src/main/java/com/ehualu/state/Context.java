package com.ehualu.state;

/**
 * Created by bright on 16-7-6.
 */
public class Context {
    public final static State state1 = new ConcreteState1();

    public final static State state2 = new ConcreteState2();

    private State currentState;

    public void setState(State _state){
        this.currentState = _state;
        this.currentState.setContext(this);
    }
    public void handle1(){
        this.currentState.handle1();
    }

    public void handle2(){
        this.currentState.handle2();
    }
}
