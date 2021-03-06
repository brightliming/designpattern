package com.ehualu.specification;

/**
 * Created by Administrator on 2016/8/14.
 */
public class OrSpecification extends CompositeSpecification{
    private ISpecification left;
    private ISpecification right;

    public OrSpecification(ISpecification _left,ISpecification _right){
        this.left = _left;
        this.right = _right;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return left.isSatisfiedBy(candidate) || right.isSatisfiedBy(candidate);
    }
}
