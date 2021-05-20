/*
	12.	In a company an employee is paid as under: If his basic salary is less than Rs. 10000,
 	then HRA = 10% of basic salary and DA = 90% of basic salary. 
	If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary.
  	If the employee's salary is 
	input by the user write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]
*/
import java.util.*;
public class Asg_12{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary: ");
		float BasSal = sc.nextInt();
		float GrossSal = grossSalary(BasSal);
		System.out.println("Gross salary = "+GrossSal);
	}
	public static float grossSalary(float BasSal){
		float GS , DA, HRA;
		if(BasSal < 10000){
			HRA = (10*BasSal)/100;
			DA  = (90*BasSal)/100;
			GS = BasSal + HRA + DA;
			return (float) (GS);
		}
		else{
			HRA = 2000;
			DA = (98*BasSal)/100;
			GS= BasSal + HRA + DA;
			return (float) (GS); 
		}
	} 

}