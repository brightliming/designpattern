package com.ehualu.proxy.dynamicproxy2;

import java.lang.reflect.InvocationHandler;

/**
 * Created by bright on 16-8-23.
 */
public class SubjectDynamicProxy extends DynamicProxy{
    public static <T> T newProxyInstance(Subject subject){
        ClassLoader classLoader = subject.getClass().getClassLoader();

        Class<?>[] classes = subject.getClass().getInterfaces();

        InvocationHandler handler = new MyInvocationHandler(subject);

        return (T) newProxyinsstance(classLoader,classes,handler);
    }
}
