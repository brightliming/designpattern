package com.ehualu.prototype;

/**
 * Created by bright on 16-8-23.
 */
public class Client {
    public static void main(String[] args){
        Thing thing = new Thing();
        thing.addArrayList("张三");

        Thing clone = thing.clone();

        clone.addArrayList("李四");

        System.out.println(thing.getArrayList());

        System.out.println(clone.getArrayList());

    }
}
