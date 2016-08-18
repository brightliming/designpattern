package com.ehualu.builder;

/**
 * Created by bright on 16-8-18.
 */
public class ConcreteBuilder extends Builder{
    private Product product = new Product();

    @Override
    public void setPart() {

    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
