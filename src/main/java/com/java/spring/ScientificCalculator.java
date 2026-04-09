package com.java.spring;

public class ScientificCalculator extends Calculator {

    @Override
    public int add(int a, int b) {
        return (int) Math.log(a + b);
    }
}
