package com.ehualu.proxy.normal;

/**
 * Created by bright on 16-8-18.
 */
public class GamePlayProxy implements IGamePlayer{

    private IGamePlayer gameplayer = null;

    public GamePlayProxy(String name){
        try {
            gameplayer = new GamePlayer(this,name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void killBoss() {
        this.gameplayer.killBoss();
    }

    public void login(String username, String password) {
        this.gameplayer.login(username,password);
    }

    public void upgrade() {
        this.gameplayer.upgrade();
    }
}
