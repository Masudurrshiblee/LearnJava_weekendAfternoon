package basic;

public class LearnVariable {
	
	int x =5;     
	int y = 10;  // These are global variable/ instance variable
	
	

	public static void main(String[] args) {
		int a= 10;
		int b=15;          //  these are local variable.
		int total =a+b;
		System.out.println(total);
		// TODO Auto-generated method stub
		
		String number="300";
		double price= 50.90;
		System.out.println(price);
		
		String firstname="masud";
		String lastname="shiblee";
		String fullname=firstname +" "+ lastname;// This + sign is called concatenation, It is used 
		System.out.println(fullname);           // to combine or join text from different column or
		                                         //row in a new row.
		System.out.println(fullname +"  "+ "is learning java");
		
		
		
		
		
		
		

	}

}
