package com.ehualu.proxy.constraint;

/**
 * Created by bright on 16-8-18.
 */
public class GamePlayer implements IGamePlayer{

    private String name = "";

    private IGamePlayer proxy = null;

    public GamePlayer(String _name){
        this.name = _name;
    }

    public void killBoss() {
        if(this.isProxy()){
            System.out.println(this.name+"在打怪！");
        }else{
            System.out.println("请使用指定的代理访问");
        }
    }

    public void login(String username, String password) {
        if(this.isProxy()){
            System.out.println("登录名为："+username+"的用户"+this.name+"在打怪");
        }else{
            System.out.println("请使用指定的代理访问");
        }

    }

    public void upgrade() {
        if(this.isProxy()){
            System.out.println(this.name+"又升了一级");
        }else{
            System.out.println("请使用指定的代理访问");
        }

    }

    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return proxy;
    }

    private boolean isProxy(){
        if(this.proxy == null){
            return  false;
        }else{
            return true;
        }
    }

}
