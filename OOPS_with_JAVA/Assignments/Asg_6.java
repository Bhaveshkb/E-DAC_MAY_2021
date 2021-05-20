/*
06.	Write a program that takes radius of a circle as input. Read the entered radius 
    using Scanner class. Then calculate and print the area and circumference of the circle.
*/
    import java.util.*;
    public class Asg_6
    {
    	public static void main(String args[])
    	{
        	Scanner sc = new Scanner(System.in);
    		System.out.println("Enter Radius of Circle: ");
    		float r = sc.nextInt();
    		float area,crf;
    		area = (float)(Math.PI * (r*r));
    		System.out.println("Area of circle is "+area);
    		crf = (float)(2 * Math.PI * r);
    		System.out.println("Circumference of circle is "+crf);
    		
    	}
}