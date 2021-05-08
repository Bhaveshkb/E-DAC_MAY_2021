/*
12. Write a Java program that takes three numbers 
as input to calculate and print the average of the numbers.
*/
import java.util.*;
import java.lang.*;
class A1_12
{
	public static void main(String args[])
	{
		System.out.println("Average of Numbers");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		int avg= (i+j+k)/3;
		
		System.out.println("Average is "+avg);
	}
}