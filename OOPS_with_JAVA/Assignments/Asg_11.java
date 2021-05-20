//11.	Write a program to swap two numbers without using third variable.
public class Asg_11{
	public static void main(String args[])
	{
		int a = 10;
		int b = 20;
		System.out.println("Before Swapping");
		System.out.println("A = "+a+" B = "+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping");
		System.out.println("A = "+a+" B = "+b);
	}
}