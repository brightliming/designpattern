package com.ehualu.decorator;

/**
 * Created by bright on 16-6-27.
 */
abstract public class Decorator extends Component{
    private Component component;
    public Decorator(Component _component){
        this.component = _component;
    }
    @Override
    public void operate(){
        this.component.operate();
    }
}
