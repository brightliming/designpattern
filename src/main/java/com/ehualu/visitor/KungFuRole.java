package com.ehualu.visitor;

/**
 * Created by bright on 16-7-6.
 */
public class KungFuRole implements Role{
    public void accept(AbsActor actor) {
        actor.act(this);
    }
}
