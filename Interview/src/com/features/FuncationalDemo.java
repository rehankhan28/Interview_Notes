package com.features;

class FuncationalDemo {
	public static void main(String[] args) {
		// Lambda expression for addition
		MathOperation addition = (int a, int b) -> a + b;
		// Lambda expression for subtraction
		MathOperation subtraction = (a, b) -> a - b;
		// Lambda expression for multiplication
		MathOperation multiplication = (a, b) -> a * b;
		// Lambda expression for division
		MathOperation division = (a, b) -> a / b;
		// Testing the operations
		System.out.println("Addition: " + operate(10, 5, addition)); // Outputs: Addition: 15
		System.out.println("Subtraction: " + operate(10, 5, subtraction)); // Outputs: Subtraction: 5
		System.out.println("Multiplication: " + operate(10, 5, multiplication)); // Outputs: Multiplication: 50
		System.out.println("Division: " + operate(10, 5, division)); // Outputs: Division: 2
	}

	private static int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}

@FunctionalInterface
interface MathOperation {
	int operation(int a, int b);
}