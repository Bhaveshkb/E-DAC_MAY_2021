// 14.	Program to check that entered year is a leap year or not.
import java.util.*;
public class Asg_14{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year to check it is leap or not ");
		int year = sc.nextInt();
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			System.out.println(year+" is a Leap Year");
		else
			System.out.println(year+" is not a Leap Year");
	}
}