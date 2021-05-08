/*
11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
*/
class A1_11
{
	public static void main(String args[])
	{
		System.out.println("Find Area and Perimeter of Circle:");
		System.out.println("Radius = 7.5");
		double rad=7.5;
		
		double peri= Math.PI * 2 *rad;
		double area= Math.PI * rad * rad;
		
		System.out.println("Perimeter is = "+peri);
		System.out.println("Area is = "+area);
		
	}
}