package com.ehualu.observer;

import java.util.Vector;

/**
 * Created by bright on 16-7-1.
 */
public abstract class Subject {
    private Vector<Observer> obsVector = new Vector<Observer>();

    public void addObserver(Observer o){
        this.obsVector.add(o);
    }

    public void deleteObserver(Observer o){
        this.obsVector.remove(o);
    }

    public void notifyObservers(){
        for(Observer o:this.obsVector){
            o.update();
        }
    }
}
