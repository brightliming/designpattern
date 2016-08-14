package com.ehualu.specification;

/**
 * Created by Administrator on 2016/8/14.
 */
public abstract class CompositeSpecification implements ISpecification{
    public abstract boolean isSatisfiedBy(Object candidate);

    public ISpecification and(ISpecification spec) {
        return new AndSpecification(this,spec);
    }

    public ISpecification or(ISpecification spec) {
        return new OrSpecification(this,spec);
    }

    public ISpecification not() {
        return new NotSpecification(this);
    }
}
