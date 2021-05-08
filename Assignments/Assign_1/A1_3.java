/*
3. Write a Java program to divide two numbers and print on the screen.
Test Data : 50/3
Expected Output : 16
*/

import java.util.*;
import java.lang.*;

class A1_3
{
	public static void main(String args[])
	{
		System.out.println("Enter two numberes for division: ");
		Scanner sc = new Scanner(System.in);
		int i= sc.nextInt();
		int j= sc.nextInt();
		
		if(j!=0)
		{
		int k=i/j;
		System.out.println("Division of two numbers: "+k);
		}
		else
		{
			System.out.println("Error: Can not divisible by Zero");
		}
	}
}

/*
class A1_3
{
	public static void main(String args[])
	{
		System.out.print("Div of 50/3 : ");
		
		System.out.print(50/3);

	}
}
*/
