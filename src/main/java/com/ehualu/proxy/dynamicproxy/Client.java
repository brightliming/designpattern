package com.ehualu.proxy.dynamicproxy;

import com.ehualu.proxy.normal.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by bright on 16-8-18.
 */
public class Client {
    public static void main(String[] args){
        IGamePlayer gamePlayer = new GamePlayer("张三");

        InvocationHandler handler = new GamePlayerIH(gamePlayer);

        IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(gamePlayer.getClass().getClassLoader(),new Class[]{IGamePlayer.class},handler);

        proxy.login("zhangsan","password");

        proxy.killBoss();

        proxy.upgrade();
    }
}
