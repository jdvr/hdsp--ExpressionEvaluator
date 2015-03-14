package com.hdsp.expressionevaluator.expressions;

import com.hdsp.expressionevaluator.Evaluable;
import com.hdsp.expressionevaluator.Expression;

public class Multiply extends BinaryOperator {

    public Multiply(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public Object value() {
        return evaluate(Operations.Multiply.toString());
    }

    @Override
    public String type() {
        return typeOf(value());
    }

    @Override
    public boolean isEvaluable() {
        return true;
    }

    @Override
    public Evaluable getEvaluable() {
        return getEvaluable(getLeft(), getRight(), Operations.Multiply.toString());
    }
}
