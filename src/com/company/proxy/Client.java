package com.company.proxy;

import static java.lang.Integer.MAX_VALUE;

public class Client {
    public static void main(String[] args) {
        MathCalculatorProxy mathCalculatorProxy = new MathCalculatorProxy();
        int result = mathCalculatorProxy.add(3,2);
        System.out.println(result);
    }
}
