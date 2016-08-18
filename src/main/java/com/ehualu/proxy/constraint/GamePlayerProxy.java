package com.ehualu.proxy.constraint;

/**
 * Created by bright on 16-8-18.
 */
public class GamePlayerProxy implements IGamePlayer,IProxy{

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
        this.count();
    }

    public IGamePlayer getProxy() {
        return this;
    }

    public void count() {
        System.out.println("升级的总费用是：150元");
    }
}
