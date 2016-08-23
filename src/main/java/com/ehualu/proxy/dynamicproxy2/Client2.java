package com.ehualu.proxy.dynamicproxy2;

/**
 * Created by bright on 16-8-23.
 */
public class Client2 {
    public static void main(String[] args){
        Subject subject = new RealSubject();

        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);

        proxy.doSomething("Finish");
    }
}
