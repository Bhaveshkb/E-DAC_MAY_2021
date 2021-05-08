import java.util.Scanner;
import java.lang.*;
/*
5. Write a Java program that takes two numbers as input and display the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125

*/
class A1_5
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers for product: ");
		int i= sc.nextInt();
		int j= sc.nextInt();
		int prod= (i*j);
		
		System.out.print(i+ "x" +j+ "=" +prod);
	}
}

