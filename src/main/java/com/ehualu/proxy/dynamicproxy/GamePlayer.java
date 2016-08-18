package com.ehualu.proxy.dynamicproxy;

import com.ehualu.proxy.normal.IGamePlayer;

/**
 * Created by bright on 16-8-18.
 */
public class GamePlayer implements IGamePlayer{

    private String name;

    public GamePlayer(String _name) {
            this.name = _name;
    }

    public void killBoss() {
        System.out.println(this.name+"在打怪！");
    }

    public void login(String username, String password) {
        System.out.println("登录名为："+username+"的用户"+this.name+"在打怪");
    }

    public void upgrade() {
        System.out.println(this.name+"又升了一级");
    }

}
