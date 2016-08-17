package com.ehualu.abstractfactory;

/**
 * Created by Administrator on 2016/8/17.
 */
public abstract class AbstractYellowHuman implements Human{
    public void getColor(){
        System.out.println("黄色人种的皮肤是黄色的");
    }

    public void talk(){
        System.out.println("黄色人种会说话，一般说的都是双字节的");
    }
}
