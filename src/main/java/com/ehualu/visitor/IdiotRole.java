package com.ehualu.visitor;

/**
 * Created by bright on 16-7-6.
 */
public class IdiotRole implements Role{
    public void accept(AbsActor actor) {
        actor.act(this);
    }
}
