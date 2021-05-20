//15.	Accept person’s gender (character m for male and f for female), age (integer),
//		as input and then check whether person is eligible for marriage or not.
import java.util.*;
public class Asg_15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Gender M (male) or F (female): ");
		char gender=sc.next().charAt(0);
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		eligible(gender,age);
	}
	public static void eligible(char gender , int age){
		if((gender == 'M' || gender == 'm') && age >= 21)
		{
			System.out.println("You are eligible for marriage");
		} 
		else if((gender == 'F' || gender ==  'f') && age >= 18)
		{
			System.out.println("You are eligible for marriage");
		}
		else
			System.out.println("You are not eligible for marriage");
	}
}