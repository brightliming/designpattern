package com.ehualu.factory;

/**
 * Created by bright on 16-8-17.
 */
public abstract class Creator {
    public abstract <T extends Product> T createProduct(Class<T> c);
}
