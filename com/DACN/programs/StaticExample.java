// Java program to demonstrate that 
// In both static and non-static methods, 
// static methods are directly accessed. 



public class StaticExample { 
	
	static int num = 100; 
	static String str = "HelloJava"; 

	static void display() 
	{ 
		System.out.println("static number is " + num); 
		System.out.println("static string is " + str); 
	} 

	void nonstatic() 
	{ 
		display(); 
	} 

	public static void main(String args[]) 
	{ 
		StaticExample obj = new StaticExample(); 
		 
		obj.nonstatic(); 
		
		display(); 
	} 
}
