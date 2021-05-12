//20. Write a Java program to convert a 
//    decimal number to hexadecimal number.

import java.util.Scanner;

public class A1_20 {

	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
		
	System.out.println("Enter Decimal no:");
	int x=s.nextInt();
	String y=Integer.toHexString(x);
	System.out.println("HexaDecimal no:"+y);
	}
}