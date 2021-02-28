package basic;

public class LocalVariablePractise {
	
	int num1=10;
	int num2=20;
	int total= num1+num2;

	public static void main(String[] args) {
		String person= "jayson";
		int roll=5; 
		double marks = 80.5;
		System.out.println("person" +   + roll +   + marks);  //Invoke local Variable
		LocalVariablePractise obj=new LocalVariablePractise();  // creating object using formula.
		System.out.println(obj.total);     // Invoke non static variable using object.
		LocalVariablePractise.TV();    // Invoke static method using class name.
		obj.phone();                  // Invoke non static method by using object
		 
	}
	public void phone() {
		System.out.println("i like i phone");
	}
	
	
	
	
	
	public static void TV() {
		System.out.println("ultra modern tv");
		
	
			
		}
	}


