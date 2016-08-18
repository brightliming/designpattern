package com.ehualu.proxy;

/**
 * Created by bright on 16-8-18.
 */
public class Proxy implements Subject{
    private Subject subject = null;

    public Proxy(){
        this.subject = new RealSubject();
    }

    public Proxy(Object... objects){

    }

    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    private void before(){

    }

    private void after(){

    }
}
