package com.ehualu.proxy.constraint;

/**
 * Created by bright on 16-8-18.
 */
public class Client {
    public static void main(String[] args){
        IGamePlayer gamePlayer = new GamePlayer("张三");

        IGamePlayer proxy = gamePlayer.getProxy();

        proxy.login("zhangsan","password");

        proxy.killBoss();

        proxy.upgrade();
    }
}
