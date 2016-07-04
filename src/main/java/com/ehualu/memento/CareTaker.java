package com.ehualu.memento;

/**
 * Created by bright on 16-7-4.
 */
public class CareTaker {
    private IMemento memento;

    public IMemento getMemento() {
        return memento;
    }

    public void setMemento(IMemento memento) {
        this.memento = memento;
    }

}
