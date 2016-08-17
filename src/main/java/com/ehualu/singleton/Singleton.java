package com.ehualu.singleton;

/**
 * Created by bright on 16-8-17.
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getSingleton(){
        return singleton;
    }

    public static void doSomething(){

    }
}
