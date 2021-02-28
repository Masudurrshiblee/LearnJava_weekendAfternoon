package basic;
// This was shown main method can be write inside the child class.But this is not a good practice.

import basic.NestedClass.computer;
//import basic.NestedClass.computer.Mobile;

public class PractiseNestedClass {
	int num = 22;
	int num1 = 32;
	static String age = "45";

	public static class computer { // Parent Class
		String computerName = "HP";
		static String computerPrice = "200"; // This variable is static because parent class is static

		public static void display() {
			System.out.println("Display is UHD");
		}

		public static class Mobile { // Child Class
			static String mobileBrand = "Iphone"; // This variable is static because the child class is static
			int mobilePrice = 1000;

			public static void main(String[] args) {
				// The difference between parent class and nested class is - In parent class
				// variable can be static
				// if the class is non static, but in nested class variable can not be static if
				// the class is not static
				computer com = new computer();
				System.out.println(com.computerName);
				System.out.println(com.computerPrice);
				computer.display();
				Mobile mobile = new Mobile(); // Here computer is parent and Mobile is child
				System.out.println(mobile.mobilePrice);
				System.out.println(computer.Mobile.mobileBrand);
			}

		}
	}

}
