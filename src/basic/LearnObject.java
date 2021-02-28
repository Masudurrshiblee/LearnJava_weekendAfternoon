package basic;

public class LearnObject {
	
	// How to create Object?
	// ClassName objectName=new ClassName();
	
	int num1=25;
	int num2=50;
	
	public static void main(String[] args) {
		
		 LearnObject Learn=new  LearnObject();
		 int Total= Learn.num1+Learn.num2;  // CAll by object name
		 System.out.println("Total value is "+Total);
		
		 //Can we create multiple object of a same class ? yes
		
		 LearnObject obj=new  LearnObject();
		 obj.num1=50;
		 obj.num2=60;
		 int output=obj.num1*obj.num2;
		 System.out.println("The total value will be  "+output);
		
		 // Creating a object from a different class and reassign value of the existing variable.
		
		 LearnStatic object1=new LearnStatic();
		 object1.stAddress="NY";  // If i comment this code it will show existing vale philadelphia.
		 System.out.println(object1.stAddress);
		 object1.phoneDisplay();
		
		}
	}
