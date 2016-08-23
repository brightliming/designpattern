package com.ehualu.proxy.dynamicproxy2;

import java.lang.reflect.InvocationHandler;

/**
 * Created by bright on 16-8-23.
 */
public class Client {
    public static void main(String[] args){
        Subject subject = new RealSubject();

        InvocationHandler handler = new MyInvocationHandler(subject);

        Subject proxy = DynamicProxy.newProxyinsstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),handler);

        proxy.doSomething("subject");
    }
}
