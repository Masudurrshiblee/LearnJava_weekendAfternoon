package basic;

import basic.NestedClass.computer.Mobile; // Import formula use when an object creation needed from child class
public class NestedClass {   // Grandparent class
	
	int num=22;
	int num1=32;
	static String age="45";  
	
	public static void main(String[] args) {    
	 // The difference between parent class and nested class is - In parent class variable can be static 
	//if the class is non static, but in nested class variable can not be static if the class is not static
		computer com = new computer();
		System.out.println(com.computerName);
		System.out.println(com.computerPrice);
		computer.display();
		computer.Mobile mobile=new Mobile();  // Here computer is parent and Mobile is child
		 System.out.println(mobile.mobilePrice);
		 System.out.println(computer.Mobile.mobileBrand);
		}
	public static class computer{      // Parent Class
		String computerName="HP";
		static String computerPrice="200"; // This variable is static because parent class is static
		public static void display() {
			System.out.println("Display is UHD");
			}
		public static class Mobile{   // Child Class
			static String mobileBrand="Iphone";  // This variable is static because the child class is static
		int mobilePrice=1000;
		}
	}
	}
