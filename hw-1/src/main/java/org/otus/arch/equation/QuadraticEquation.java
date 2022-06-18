package org.otus.arch.equation;

import org.otus.arch.utils.DoubleUtils;

public class QuadraticEquation extends Equation {

    private final double a;
    private final double b;
    private final double c;

    private QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static QuadraticEquation from(double a, double b, double c) {
        if (DoubleUtils.areEqual(a, 0)) {
            throw new IllegalArgumentException("a must not be null");
        }

        return new QuadraticEquation(a, b, c);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

}
