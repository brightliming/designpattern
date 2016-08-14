package com.ehualu.specification;

/**
 * Created by Administrator on 2016/8/14.
 */
public class NotSpecification extends CompositeSpecification{
    private ISpecification spec;

    public NotSpecification(ISpecification _spec){
        this.spec = _spec;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return  ! spec.isSatisfiedBy(candidate);
    }
}
