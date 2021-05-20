/*
	09.	Write a program to read the days (eg. 670 days) as integer value using Scanner class.
 		Now convert the entered days into complete years, months and days and print them.
*/
import java.util.*;
public class Asg_9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of total days : ");
		int days = sc.nextInt();
		convert(days);
	}
	public static void convert(int day){
		int num = day;
		int y , m , d;
		y = day / 365;
		day = day - (365 - y);
		m = day/30;
		day = day - (30-m);
		System.out.println(num+" Days is written as "+y+" year "+m+" month "+day+" days.");
	}
}