package org.otus.arch.utils;

public class DoubleUtils {

    public static double EPSILON = 0.000001;

    public static boolean areEqual(double a, double b) {
        return compare(a, b) == 0;
    }

    public static int compare(double a, double b) {
        double delta = a - b;
        if (Math.abs( delta ) < EPSILON) {
            return 0;
        } else {
            return delta > EPSILON ? 1 : -1;
        }
    }

}
