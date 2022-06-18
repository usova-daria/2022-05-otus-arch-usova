package org.otus.arch.colvers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.otus.arch.equation.QuadraticEquation;
import org.otus.arch.utils.DoubleUtils;

import static org.junit.jupiter.api.Assertions.*;

class DiscriminantQuadraticEquationSolverTest {

    private static final DiscriminantQuadraticEquationSolver solver = new DiscriminantQuadraticEquationSolver();

    @Test
    @DisplayName("Equation with no roots")
    void solveEquationWithNoRoots() {
        QuadraticEquation equation = QuadraticEquation.from(1, 0, 1);
        assertEquals( 0, solver.solve(equation).getSolutionsCount() );
    }

    @Test
    @DisplayName("Equation with two roots")
    void solveEquationWithTwoRoots() {
        QuadraticEquation equation = QuadraticEquation.from(1, 0, -1);
        EquationSolution solution = solver.solve(equation);

        assertEquals( 2, solution.getSolutionsCount() );
        testSolution(-1, solution.getSolutions()[0]);
        testSolution(1, solution.getSolutions()[1]);
    }

    @Test
    @DisplayName("Equation with one root")
    void solveEquationWithOneRoot() {
        QuadraticEquation equation = QuadraticEquation.from(1, 2, 1);
        EquationSolution solution = solver.solve(equation);

        assertEquals( 1, solution.getSolutionsCount() );
        testSolution(-1, solution.getSolutions()[0]);
    }

    @Test
    @DisplayName("Equation with one root, discriminant is less than epsilon")
    void solveEquationWithOneRoot_DiscriminantNotZero() {
        QuadraticEquation equation = QuadraticEquation.from(1, Math.sqrt(DoubleUtils.EPSILON) / 10, 0);
        EquationSolution solution = solver.solve(equation);

        assertEquals( 1, solution.getSolutionsCount() );
        testSolution(- Math.sqrt(DoubleUtils.EPSILON) / 20, solution.getSolutions()[0]);
    }

    private static void testSolution(double expected, double actual) {
        assertTrue(DoubleUtils.areEqual(expected, actual), expected + " expected but found " + actual);
    }

}