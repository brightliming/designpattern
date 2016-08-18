package com.ehualu.builder;

/**
 * Created by bright on 16-8-18.
 */
public class Director {
    private Builder builder = new ConcreteBuilder();

    public Product getAProduct(){
        builder.setPart();
        return builder.buildProduct();
    }
}
