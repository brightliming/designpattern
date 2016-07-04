package com.ehualu.memento;

/**
 * Created by bright on 16-7-4.
 */
public class Client {
    public static void main(String[] args){
        Originator ori = new Originator();

        CareTaker taker = new CareTaker();

        ori.setState1("中国华录");
        ori.setState2("大众创新");
        ori.setState3("万众创业");
        System.out.println("初始化状态："+ori);

        IMemento memento = ori.createMemento();
        taker.setMemento(memento);

        ori.setState1("软件");
        ori.setState2("架构");
        ori.setState3("优秀");
        System.out.println("修改后状态："+ori);

        ori.restoreMemento(taker.getMemento());

        System.out.println("恢复后状态："+ori);

    }
}
