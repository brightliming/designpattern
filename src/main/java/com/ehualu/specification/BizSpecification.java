package com.ehualu.specification;

/**
 * Created by Administrator on 2016/8/14.
 */
public class BizSpecification extends CompositeSpecification{

    private Object obj;
    public BizSpecification(Object _obj){
        this.obj = _obj;
    }
    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return false;
    }
}
