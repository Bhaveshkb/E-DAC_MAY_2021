/*
04.	Write a program that initializes 2 byte type of variables. Add the values of these variables 
    and store in a byte type of variable. [Note: primitive down casting is required in this program ] .
*/
public class Asg_4
{
	public static void main(String args [])
	{
		byte a = 100;
		byte b = 30;
		byte c = (byte)(a + b);
		System.out.println("Addition of two byte variables is "+c);

	}
}