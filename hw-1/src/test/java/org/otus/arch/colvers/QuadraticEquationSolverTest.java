package org.otus.arch.colvers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.otus.arch.equation.QuadraticEquation;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationSolverTest {

    private static final QuadraticEquationSolver solver = new QuadraticEquationSolver();

    @Test
    @DisplayName("Equation with no roots")
    void solveEquationWithNoRoots() {
        QuadraticEquation equation = QuadraticEquation.from(1, 0, 1);
        assertEquals( 0, solver.solve(equation).getSolutionsCount() );
    }

}