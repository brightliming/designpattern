package com.ehualu.memento;

import java.util.HashMap;

/**
 * Created by bright on 16-7-4.
 */
public class Memento {
    private HashMap<String,Object> statemap;


    public Memento(HashMap<String,Object> _statemap){
        this.statemap = _statemap;
    }

    public HashMap<String, Object> getStatemap() {
        return statemap;
    }

    public void setStatemap(HashMap<String, Object> statemap) {
        this.statemap = statemap;
    }

}
