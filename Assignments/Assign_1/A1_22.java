//22. Write a Java program to 
//    convert a binary number to decimal number.

import java.util.Scanner;

public class A1_22 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Binary no:");
		String x=s.next();
		System.out.println(Integer.parseInt(x,2));
	}
}