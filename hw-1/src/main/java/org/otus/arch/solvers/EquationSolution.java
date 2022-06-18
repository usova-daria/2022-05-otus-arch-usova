package org.otus.arch.solvers;

public class EquationSolution {

    private final double[] solutions;

    public EquationSolution(double[] solution) {
        this.solutions = solution;
    }

    public int getSolutionsCount() {
        return solutions == null ? 0 : solutions.length;
    }

    public double[] getSolutions() {
        return solutions == null ? new double[0] : solutions;
    }

}
