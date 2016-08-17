package com.ehualu.factory;

/**
 * Created by bright on 16-8-17.
 */
public class ConcreteCreator extends Creator{
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
