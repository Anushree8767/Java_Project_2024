// Java program to illustrate the
// concept of single inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

// Parent class
class One {
	public void print_Anu()
	{
		System.out.println("Anu");
	}
}

class Two extends One {
	public void print_for() { 
		System.out.println("for"); 
		}
}

// Driver class
public class Main {
	// Main function
	public static void main(String[] s)
	{
		Two g = new Two();
		g.print_Anu();
		g.print_for();
		g.print_Anu();
	}
}
