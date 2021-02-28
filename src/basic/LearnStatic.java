package basic;

public class LearnStatic {
	int age1;
	public static String stName = "Esha";
	String stAddress = "Philadelphia";
	int PntAdmissionFee = 5000;

	public static void phoneDisplay() { // Static Method

		System.out.println("iphone display have better resolution");

	}

	public void regularDisplay() { // Non static method
		System.out.println("Regular phone have less resolution display");
	}

	public static void main(String[] args) {
		// semicolon we use for complete a statement.
		// How can we call static variable inside the main method
		// Ans: static variable are called using class name as bellow
		LearnStatic.stName = "Kevin";// Re-Assign value
		System.out.println(LearnStatic.stName);
		// How can we call a non static variable inside the main method
		// Ans: By creating an object of that class
		LearnStatic object = new LearnStatic();
		System.out.println(object.stAddress);
		object.age1 = 26;
		object.PntAdmissionFee = 4500; // the way is re-assign the value because value can not be change in
										// class level.
		System.out.println(object.PntAdmissionFee);
		System.out.println("Age of Esha is  " + object.age1);

		LearnStatic.phoneDisplay(); // Calling Static method
		object.regularDisplay(); // Calling Non Static method

	}

}
