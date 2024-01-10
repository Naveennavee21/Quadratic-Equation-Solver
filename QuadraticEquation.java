package com.quadratic;

public class QuadraticEquation {
	private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] findRoots() {
        double determinant = b * b - 4 * a * c;

        if (determinant > 0) {
            double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            return new double[]{root1, root2};
        } else if (determinant == 0) {
            double root = -b / (2 * a);
            return new double[]{root, root};
        } else {
            return null; // No real roots
        }
    }

}
