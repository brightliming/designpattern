package com.ehualu.proxy.normal;

/**
 * Created by bright on 16-8-18.
 */
public class GamePlayer implements IGamePlayer{

    private String name;

    public GamePlayer(IGamePlayer _gameplayer,String _name) throws Exception {
        if(_gameplayer == null){
            throw new Exception("不能创建真实角色！");
        }else{
            this.name = _name;
        }
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
