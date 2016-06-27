package com.ehualu.decorator;

/**
 * Created by bright on 16-6-27.
 */
public class Client {
        public static void main(String[] args){
            Component component = new ConcreteComponent();
            Decorator decorator  = new ConcreteDecorator1(component);
            decorator = new ConcreteDecorator2(decorator);
            decorator.operate();
        }
}
