package com.hdsp.expressionevaluator.model;

public class IntegerIntegerSubtraction extends BinaryOperation {

    public IntegerIntegerSubtraction(Object left, Object right) {
        super(left, right);
    }

    @Override
    public Object value() {
        return (Integer) getLeft() - (Integer) getRight();
    }

    @Override
    public String type() {
        return "Integer";
    }
}
