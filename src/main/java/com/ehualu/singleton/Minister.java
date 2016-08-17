package com.ehualu.singleton;

/**
 * Created by bright on 16-8-17.
 */
public class Minister {
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            Emperor emperor = Emperor.getInstance();
            System.out.println("第"+(i+1)+"个大臣参拜的是");
            emperor.say();
        }
    }
}
