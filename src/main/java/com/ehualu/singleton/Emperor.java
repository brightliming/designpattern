package com.ehualu.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by bright on 16-8-17.
 */
public class Emperor {
    private static int maxNumOfEmperor = 2;

    private static List<String> nameList = new ArrayList<String>();

    private static List<Emperor> emperorList = new ArrayList<Emperor>();

    private static int countNumOfEmporer = 0;

    static{
        for(int i = 0;i<maxNumOfEmperor;i++){
            emperorList.add(new Emperor("皇"+(i+1)+"帝"));
        }
    }

    private Emperor(){}

    private Emperor(String name){
        nameList.add(name);
    }

    public static Emperor getInstance(){
        Random random = new Random();
        countNumOfEmporer = random.nextInt(maxNumOfEmperor);
        return emperorList.get(countNumOfEmporer);
    }

    public static void say(){
        System.out.println(nameList.get(countNumOfEmporer));
    }
}
