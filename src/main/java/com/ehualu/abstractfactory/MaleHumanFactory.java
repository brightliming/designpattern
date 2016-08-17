package com.ehualu.abstractfactory;

/**
 * Created by Administrator on 2016/8/17.
 */
public class MaleHumanFactory implements HumanFactory{
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
