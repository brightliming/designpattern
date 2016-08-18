package com.ehualu.template;

/**
 * Created by bright on 16-8-18.
 */
public class Client {
    public static void main(String[] args){
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();

        class1.templateMethod();
        class2.templateMethod();
    }
}
