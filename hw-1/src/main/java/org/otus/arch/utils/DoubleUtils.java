package org.otus.arch.utils;

public class DoubleUtils {

    public static double EPSILON = 0.000001;

    public static boolean areEqual(double a, double b) {
        return Math.abs(a - b) < EPSILON;
    }

}
