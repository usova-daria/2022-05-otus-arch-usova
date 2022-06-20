package org.otus.arch.equation;

import org.otus.arch.utils.DoubleUtils;

import java.util.List;
import java.util.stream.Stream;

public class QuadraticEquation extends Equation {

    private static final List<Double> NOT_ACCEPTABLE_COEFFICIENTS = List.of(
            Double.NaN,
            Double.NEGATIVE_INFINITY,
            Double.POSITIVE_INFINITY
    );

    private final double a;
    private final double b;
    private final double c;

    private QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static QuadraticEquation from(double a, double b, double c) {
        if (Stream.of(a, b, c).anyMatch(NOT_ACCEPTABLE_COEFFICIENTS::contains)) {
            throw new IllegalArgumentException("Not acceptable coefficients: a=" + a + ", b = " + b + ", c =" + c);
        }

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
