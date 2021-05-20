/*
07.	Write a program to calculate sum of 5 subject’s marks & find percentage. 
	Take the obtained marks from user using Scanner class.
 	Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.
*/

import java.util.*;
public class Asg_7{
	public static void main(String args[]){
		double Percentage=IOmarks();
		System.out.println("Percentage marks = "+Percentage+" % ");

	}
	static Scanner mark = new Scanner(System.in);
	public static double IOmarks(){
		System.out.println("Enter 5 Subjects Marks: ");
		int [] marks = new int [5];
		double sum = 0;
		for(int i=0; i<marks.length;i++){
			marks[i]=mark.nextInt();
			sum = sum + marks[i];
		}
		double avg = (double)(sum / marks.length);
		return avg;
	}
}
