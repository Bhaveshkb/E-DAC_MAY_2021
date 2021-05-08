import java.util.Scanner;
import java.lang.*;

/*
2. Write a Java program to print the sum of two numbers.
Test Data: 74 + 36
*/
class A1_2
{
	public static void main(String args[])
	{
		System.out.println("Enter two numberes for sum: ");
		Scanner sc = new Scanner(System.in);
		int i= sc.nextInt();
		int j= sc.nextInt();
		int k=i+j;
		
		System.out.println("Sum of two numbers: "+k);

	}
}

/*
class A1_2
{
	public static void main(String args[])
	{
		System.out.print("Sum of 74 + 36 : ");
		
		System.out.print(74+36);

	}
}
*/