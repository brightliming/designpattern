package com.ehualu.specification;

/**
 * Created by Administrator on 2016/8/14.
 */
public interface ISpecification {
    public boolean isSatisfiedBy(Object candidate);

    public ISpecification and(ISpecification spec);

    public ISpecification or(ISpecification spec);

    public ISpecification not();

}
