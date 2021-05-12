//24. Write a Java program to convert a
//    binary number to a Octal number.
import java.util.Scanner;

public class A1_24 {

	public static void main(String[] args) 
	{
		String Oct;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Binary no:");
		String x=s.next();
		int dec=Integer.parseInt(x,2);
		
		
		Oct=Integer.toOctalString(dec);
		System.out.println("Ocatal no:"+Oct);
	}
}