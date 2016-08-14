package com.ehualu.specification;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/8/14.
 */
public class Client {
    public static void main(String[] args){
        ArrayList<Object> list = new ArrayList();

        ISpecification spec1 = new BizSpecification(new Object());

        ISpecification spec2 = new BizSpecification(new Object());

        for(Object obj:list){
            if(spec1.and(spec2).isSatisfiedBy(obj)){
                System.out.println(obj);
            }
        }
    }
}
