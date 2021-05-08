import java.util.Scanner;
import java.lang.*;
/*
7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/
class A1_7
{
public static void main(String args[])
{
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number for table : ");
	int i =sc.nextInt();
	int j=1,k;
	while(j<=10)
	{
		k=i*j;
		System.out.println(i+" * "+j+" = "+k);
		j++;
	}
}
}