// Java Program to illustrate Final keyword

import java.io.*;
import java.util.*;

class C {

	public void firstName()
	{
		System.out.println("Mayank");
	}

	public void surName()
	{
		System.out.println("Trivedi");
	}
}

class P extends C {

	public void surName()
	{
		System.out.println("Sharma");
	}

	public static void main(String[] s)
	{

		System.out.println("ABC");
	}
}
