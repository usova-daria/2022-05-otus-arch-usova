package org.otus.arch.equation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {

    @Test
    @DisplayName("a must not be null")
    void testFromInvalidArguments() {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.from(0, 1, 1));
    }

    @ParameterizedTest
    @ValueSource(doubles = { Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY})
    @DisplayName("Equation with not acceptable coefficients")
    void testFromNotAcceptableCoefficients(double d) {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.from(d, 1, 1));
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.from(1, d, 1));
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.from(1, 1, d));
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.from(d, d, d));
    }

}