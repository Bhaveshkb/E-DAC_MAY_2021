/*
03.	Find the result of following expressions. You need to determine the primitive data type of the variable
    by looking carefully the given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]
*/

public class Asg_3
{
	public static void main(String args [])
	{
		int x=5,y=10,z=15;
		
		y = x^2 + 3*x -7;
		System.out.println("A . y = x^2 + 3*x -7 ");
		System.out.println("    y = "+y);

		y = x++ + ++x ;
		System.out.println("B . y = x++ + ++x");
		System.out.println("    x = "+x+" y = "+y);
		
		z = x++ - --y - --x + x++;
		System.out.println("C . z = x++ - --y - --x + x++ ");
		System.out.println("    x = "+x+" y = "+y+" z = "+z);
		
		boolean p=true;
		boolean q=false;
		boolean r;
		r = (p && q) || !(p || q);
		System.out.println("D . z = (x && y) || !(x || y");
		System.out.println("    z = "+r);
	}
}


