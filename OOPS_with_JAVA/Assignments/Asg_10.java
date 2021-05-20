/*
	10.	Write a program to convert temperature from Fahrenheit to Celsius. 
		Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]
*/
import java.util.*;
public class Asg_10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit: ");
		float Fahrenheit = sc.nextFloat();
		float Celsius = converter(Fahrenheit);
		System.out.println("Temperature in Celsius = "+Celsius+" degree Celsius");
	}
	public static float converter(double temp){
		float cel = (float)(5 * (temp - 32)/9) ;
		return cel;
	}
}