package com.ehualu.factory;

/**
 * Created by bright on 16-8-17.
 */
public class Client {
    public static void main(String[] args){
        Creator creator = new ConcreteCreator();

        Product product = creator.createProduct(ConcreteProduct1.class);

        product.method1();
        product.method2();
    }
}
