package org.otus.arch.equation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {

    @Test
    @DisplayName("a must not be null")
    void testFromInvalidArguments() {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.from(0, 1, 1));
    }

}