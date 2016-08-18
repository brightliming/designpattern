package com.ehualu.proxy.constraint;

/**
 * Created by bright on 16-8-18.
 */
public interface IGamePlayer {
    public void killBoss();

    public void login(String username, String password);

    public void upgrade();

    public IGamePlayer getProxy();
}
