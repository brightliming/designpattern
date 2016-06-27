package com.ehualu.decorator;

/**
 * Created by bright on 16-6-27.
 */
public class ConcreteComponent extends Component{
    @Override
    public void operate() {
        System.out.println("do something");
    }
}
