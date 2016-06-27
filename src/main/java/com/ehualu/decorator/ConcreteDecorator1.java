package com.ehualu.decorator;

/**
 * Created by bright on 16-6-27.
 */
public class ConcreteDecorator1 extends Decorator{

    public ConcreteDecorator1(Component _component) {
        super(_component);
    }
    private void method1(){
        System.out.println("method1修饰");
    }
    @Override
    public void operate(){
        this.method1();
        super.operate();
    }
}
