package com.ehualu.proxy.constraint;

/**
 * Created by bright on 16-8-18.
 */
public class GamePlayerProxy implements IGamePlayer{

    private IGamePlayer gameplayer = null;

    public GamePlayerProxy(IGamePlayer _gameplayer){
        this.gameplayer = _gameplayer;
    }

    public void killBoss() {
        this.gameplayer.killBoss();
    }

    public void login(String username, String password) {
        this.gameplayer.login(username, password);
    }

    public void upgrade() {
        this.gameplayer.upgrade();
    }

    public IGamePlayer getProxy() {
        return this;
    }
}
