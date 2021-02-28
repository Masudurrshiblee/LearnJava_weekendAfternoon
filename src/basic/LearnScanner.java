package basic;

import java.util.Scanner;

public class LearnScanner {

	public static void main(String[] args) {
		// To get instance of java scanner which reads input from user ,we need to pass
		// the input stream ( System.in)
		// the constructor of scanner class as follows
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your firstname");
		// String firstname1="ABcd"; // If we use this code of line it will print the
		// name of ABcd
		String firstname = scan.nextLine(); // But if we use this code then we write the value of name in the console
		System.out.println("First Name is " + firstname);// Then hit enter it will print the name in the next line.
		System.out.println("Enter your lastname");
		String lastname = scan.nextLine();
		System.out.println("Last name is " + lastname);

		System.out.println("Full Name is " + firstname + " " + lastname);
		System.out.println("Enter Course Fee");
		double cFee = scan.nextDouble();
		System.out.println("Enter your course Fee " + cFee);
		System.out.println("Enter your age");
		int age = scan.nextInt();
		System.out.println("Your age =" + age);
		scan.close(); // To close scanner

	}

}
