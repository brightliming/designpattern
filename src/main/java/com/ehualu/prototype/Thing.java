package com.ehualu.prototype;

import java.util.ArrayList;

/**
 * Created by bright on 16-8-23.
 */
public class Thing implements Cloneable {
    private ArrayList<String> arrayList = new ArrayList<String>();


    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public void addArrayList(String info) {
        this.arrayList.add(info);
    }

    public void setArrayList(ArrayList<String> _arrayList) {
        this.arrayList = _arrayList;
    }

    @Override
    public Thing clone(){
        Thing thing = null;
        try {
            thing = (Thing)super.clone();
            thing.arrayList = (ArrayList) this.arrayList.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
