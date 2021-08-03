package com.company.proxy;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class MathCalculatorProxy implements Calculator {
    private MathCalculator mathCalculator = new MathCalculator();

    @Override
    public int add(int a, int b) {
        if (a / 2 + b / 2 >= MAX_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        if (a / 2 + b / 2 <= MIN_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        return mathCalculator.add(a, b);
    }

    @Override
    public int sub(int a, int b) {
        if (a / 2 - b / 2 >= MAX_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        if (a / 2 - b / 2 <= MIN_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        return mathCalculator.sub(a, b);
    }

    @Override
    public int mul(int a, int b) {
        int result = mathCalculator.mul(a, b);
        if (a != 0 && result / a != b) {
            throw new RuntimeException("Out of range");
        }
        return result;
    }

    @Override
    public int div(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Out of range");
        }
        return mathCalculator.div(a, b);
    }
}
