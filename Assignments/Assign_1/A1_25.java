//25. Write a Java program to convert a 
//    octal number to a decimal number.

import java.util.Scanner;

public class A1_25 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Decimal no:");
		String x=s.next();
		int oct=Integer.parseInt(x,8);
		System.out.println("Ocatal no:"+oct);

	}
}