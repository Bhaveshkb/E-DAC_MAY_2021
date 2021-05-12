// 21. Write a Java program to convert a 
//    decimal number to octal number.
import java.util.Scanner;

public class A1_21{

	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
		
	System.out.println("Enter Decimal no:");
	int x=s.nextInt();
		
	System.out.println(Integer.toOctalString(x));	
	}
}