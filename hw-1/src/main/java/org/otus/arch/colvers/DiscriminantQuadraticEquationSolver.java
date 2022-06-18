package org.otus.arch.colvers;

import org.otus.arch.equation.QuadraticEquation;
import org.otus.arch.utils.DoubleUtils;

public class DiscriminantQuadraticEquationSolver implements EquationSolver<QuadraticEquation> {

    @Override
    public EquationSolution solve(QuadraticEquation equation) {
        double discriminant = equation.getB() * equation.getB() - 4 * equation.getA() * equation.getC();
        double[] solutions = null;

        if (DoubleUtils.compare(discriminant, 0) == -1) {
            solutions = new double[0];
        } else if (DoubleUtils.compare(discriminant, 0) == 1) {
            double discriminantSqrt = Math.sqrt( discriminant );
            solutions = new double[]{ (- equation.getB() - discriminantSqrt) / 2 / equation.getA(),
                                      (- equation.getB() + discriminantSqrt) / 2 / equation.getA()};
        }

        return new EquationSolution(solutions);
    }

}
