package com.ehualu.abstractfactory;

/**
 * Created by Administrator on 2016/8/17.
 */
public class FemaleHumanFactory implements HumanFactory{
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
