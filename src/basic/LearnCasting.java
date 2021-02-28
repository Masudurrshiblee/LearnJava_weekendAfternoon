package basic;
public class LearnCasting {
	//Casting means converting datatype
	//primitive data type to primitive data type
	//Non primitive to non primitive

	public static void main(String[] args) {
		// Converting double to int
		double price = 25.99;
		int discountprice = (int) price;
		System.out.println(discountprice);
		
		// converting int to double
		int age=20;
		double newAge=(double) age;
		System.out.println(newAge);
		
		// Converting string to int
		String ssn = "12345";
		int newSsn = Integer.parseInt(ssn);  //  This is one way
		int newSsn1 = Integer.valueOf(ssn);  // Another way
		System.out.println(newSsn);
		System.out.println(newSsn1);
		// Converting int to String
		int salary = 2500;
		String newSalary = String.valueOf(salary);
		System.out.println(newSalary);
		}

}
