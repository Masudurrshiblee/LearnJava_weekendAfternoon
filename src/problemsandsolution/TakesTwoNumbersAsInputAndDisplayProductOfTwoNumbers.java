package problemsandsolution;

import java.util.Scanner;

public class TakesTwoNumbersAsInputAndDisplayProductOfTwoNumbers {

	public static void main(String[] args) {
		// write a java program that takes two numbers as input and display the product
		// of two numbers
		// test data: input first number:25 input second number:5
		// Expected output : 25 X 5 = 125

		Scanner scan = new Scanner(System.in);
		System.out.println("Input first Number");
		int num1 = scan.nextInt();
		System.out.println("Input second number");
		int num2 = scan.nextInt();
		int product = num1 * num2;
		System.out.println("product will be " + num1 + "x" + num2 + "=" + product);
		// System.out.println("The result will be "+ product); //( This will show
		// different result)

		// Assume Two decimal numbers; 5.5 and 6.5;

		System.out.println("Input first number");
		double num3 = scan.nextDouble();
		System.out.println("Input second number");
		double num4 = scan.nextDouble();
		double result = num3 + num4;
		System.out.println("Result will be " + num3 + " + " + num4 + " = " + result);
		scan.close();
	}

}
