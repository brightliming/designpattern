package com.ehualu.proxy.dynamicproxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by bright on 16-8-18.
 */
public class DynamicProxy<T> {
    public static <T> T newProxyinsstance(ClassLoader classLoader, Class[] interfaces, InvocationHandler handler){
          if(true){
              (new BeforeAdvice()).exec();
          }

        return (T) Proxy.newProxyInstance(classLoader,interfaces,handler);
    }
}
