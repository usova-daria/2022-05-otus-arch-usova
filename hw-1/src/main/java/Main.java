import org.otus.arch.colvers.EquationSolution;
import org.otus.arch.colvers.EquationSolver;
import org.otus.arch.colvers.DiscriminantQuadraticEquationSolver;
import org.otus.arch.equation.QuadraticEquation;
import org.otus.arch.utils.DoubleUtils;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = QuadraticEquation.from(-1, 1, 1);
        EquationSolver<QuadraticEquation> solver = new DiscriminantQuadraticEquationSolver();

        EquationSolution solution = solver.solve(quadraticEquation);
        System.out.println("Equation " + format(quadraticEquation) + " has " + solution.getSolutionsCount() + " roots");
        if (solution.getSolutionsCount() != 0) {
            System.out.println("Roots: " + Arrays.toString(solution.getSolutions()));
        }
    }

    private static String format(QuadraticEquation equation) {
        String firstTerm = equation.getA() + "x^2";
        String secondTerm = getPolynomial(1, equation.getB());
        String thirdTerm = getPolynomial(0, equation.getC());

        return firstTerm + secondTerm + thirdTerm;
    }

    private static String getPolynomial(int degree, double coefficient) {
        String xEntry = degree == 0 ? "" : "x^" + degree;
        return DoubleUtils.areEqual(coefficient, 0) ? "" : getSign(coefficient) + Math.abs(coefficient) + xEntry;
    }

    private static String getSign(double d) {
        return DoubleUtils.compare(d, 0) == 1 ? "+" : "-";
    }

}
