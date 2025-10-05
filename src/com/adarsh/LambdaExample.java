package com.adarsh;

interface MathemticalInterface {
	int operate(int a, int b);
}

/*
 * class SumOperation implements MathemticalInterface {
 * 
 * public int operate(int a, int b) { return a + b; }
 * 
 * }
 * 
 * class MultiplyOperation implements MathemticalInterface {
 * 
 * public int operate(int a, int b) { return a * b; }
 * 
 * }
 * 
 * class DivideOperation implements MathemticalInterface {
 * 
 * public int operate(int a, int b) { return a / b; }
 * 
 * }
 */

public class LambdaExample {
	
	
	
	private static int calculate(int a, int b, MathemticalInterface interface1) {
		return interface1.operate(a, b);
	}
	

	public static void main(String[] args) {
//		MathemticalInterface sumOperation = new SumOperation();
//		int sum = calculate(5, 3, sumOperation);
//		
		
		int sum = calculate(5, 3, (a, b) -> a + b);
		System.out.println("Sum: " + sum);

		int product = calculate(5, 3, (a, b) -> a * b);
		System.out.println("Product: " + product);

		int divide = calculate(5, 3, (a, b) -> a / b);
		System.out.println("Divide: " + divide);
	}

}
