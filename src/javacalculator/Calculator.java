package javacalculator;

import java.util.Scanner;

public class Calculator {

	// Method for addition
	public static double add(double a, double b) {
		return a + b;
	}

	// Method for Subtraction
	public static double subtract(double a, double b) {
		return a - b;
	}

	// Method for Multiplication
	public static double multiply(double a, double b) {
		return a * b;
	}

	// Method for Divide
	public static double divide(double a, double b) {
		if (b == 0) {
			System.out.println("❌ cannot divide by zero.");
			return Double.NaN;
		}
		return a / b;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean keepRunning = true;

		System.out.println("📟 Welcome to Java Console Calculator!");

		while (keepRunning) {
			System.out.println("\nChoose an operation:");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Exit");

			System.out.println("Enter your choice(1-5): ");
			int choice = input.nextInt();

			if (choice == 5) {
				System.out.println("Exiting calculator...");
				break;
			}

			System.out.print("Enter first number: ");
			double num1 = input.nextDouble();

			System.out.print("Enter second number: ");
			double num2 = input.nextDouble();

			double result;

			switch (choice) {
			case 1:
				result = add(num1, num2);
				System.out.println("Result:" + result);
				break;
				
			case 2:
				result = subtract(num1, num2);
				System.out.println("Result:" + result);
				break;
				
			case 3:
				result = multiply(num1, num2);
				System.out.println("Result:" + result);
				break;
				
			case 4:
				result = divide(num1, num2);
				System.out.println("Result:" + result);
				break;
				
				default:
					System.out.println("Invalid choice. Try again.");
			}
		}
		input.close();
	}
}