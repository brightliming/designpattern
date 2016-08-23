package com.ehualu.proxy.dynamicproxy2;

/**
 * Created by bright on 16-8-23.
 */
public class BeforeAdvice implements IAdvice{
    public void exec() {
        System.out.println("我是前置通知");
    }
}
