package com.ehualu.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by bright on 16-8-18.
 */
public class GamePlayerIH implements InvocationHandler{

    Class cl = null;

    Object obj = null;

    public GamePlayerIH(Object _obj){
        this.obj = _obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result =  method.invoke(obj,args);

        if(method.getName().equalsIgnoreCase("login")){
            System.out.println("有人用我的帐号登录了");
        }

        return result;
    }
}
