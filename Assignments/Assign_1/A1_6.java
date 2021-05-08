/*6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/
import java.util.*;
import java.lang.*;

class A1_6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int i= sc.nextInt();
		System.out.println("Enter Second Number: ");
		int j= sc.nextInt();
		
		System.out.println(i+"  +  "+j+"  = "+(i+j));
		System.out.println(i+"  -  "+j+"  = "+(i-j));
		System.out.println(i+"  *  "+j+"  = "+(i*j));
		System.out.println(i+"  /  "+j+"  = "+(i/j));
		System.out.println(i+" mod "+j+"  = "+(i%j));
	}
	
}
