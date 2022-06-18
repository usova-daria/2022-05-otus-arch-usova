package org.otus.arch.colvers;

import org.otus.arch.equation.Equation;

public class QuadraticEquationSolver implements EquationSolver {

    @Override
    public EquationSolution solve(Equation equation) {
        return new EquationSolution(new double[]{ 1, 2 });
    }

}
