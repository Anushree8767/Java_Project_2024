// Java Program to Illustrate Static Access Modifier

import java.io.*;
import java.util.*;

class StaticEx {

	
	static int x = 22;

	int y = 40;

	public static void main(String[] args)
	{

		StaticEx t1 = new StaticEx();

		t1.x = 66;
		t1.y = 37;

		
		StaticEx t2 = new StaticEx();

		System.out.println(
			"Value of Static variable x = " + t2.x + "\n"
			+ "Value of Instance variable y = " + t2.y);
	}
}
