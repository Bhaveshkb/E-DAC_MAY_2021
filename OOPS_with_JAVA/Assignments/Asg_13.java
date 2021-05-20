/*	13.Program to find greatest in 3 numbers.
 	   [once using if else statement and then using ternary operator ( logical operator) ]  
*/
public class Asg_13{
	public static void main(String args[]){
		
		int a = 10;
		int b = 20;
		int c = 100;
		/*
		if(a>b && a>c)
			System.out.println(a+" is greatest");
		else if(b>c)
			System.out.println(b+" is greatest");
		else
			System.out.println(c+" is greatest");
		*/
		int greatest=(a>b)?((a>c)?a:c):(b>c)?b:c;
		System.out.println(greatest+" is greatest");
	}
}