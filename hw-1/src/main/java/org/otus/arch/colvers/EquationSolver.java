package org.otus.arch.colvers;

import org.otus.arch.equation.Equation;

public interface EquationSolver<T extends Equation> {

    EquationSolution solve(T equation);

}
