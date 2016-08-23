package com.ehualu.proxy.dynamicproxy2;

/**
 * Created by bright on 16-8-18.
 */
public class RealSubject implements Subject{
    public void doSomething(String str) {
        System.out.println("do something--->"+str);
    }
}
