package org.otus.arch.colvers;

import org.otus.arch.equation.QuadraticEquation;
import org.otus.arch.utils.DoubleUtils;

public class QuadraticEquationSolver implements EquationSolver<QuadraticEquation> {

    @Override
    public EquationSolution solve(QuadraticEquation equation) {
        double discriminant = equation.getA() * ( equation.getA() - 4 * equation.getC());
        if (DoubleUtils.compare(discriminant, 0) == -1) {
            return new EquationSolution(new double[0]);
        }
        return new EquationSolution(new double[]{ 1, 2 });
    }

}
