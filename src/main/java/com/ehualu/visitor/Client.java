package com.ehualu.visitor;

/**
 * Created by bright on 16-7-6.
 */
public class Client {
    public static void main(String[] args){
        AbsActor actor = new OldActor();

        Role role = new KungFuRole();

        actor.act(role);
        actor.act(new KungFuRole());

        role.accept(actor);
    }
}
