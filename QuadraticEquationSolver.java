package com.quadratic;
import java.util.Scanner;

public class QuadraticEquationSolver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients of the quadratic equation (a, b, c):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        
        double[] roots = equation.findRoots();
        
        if (roots != null) {
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        } else {
            System.out.println("No real roots found.");
        }

        scanner.close();
    }

	}


