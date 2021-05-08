//14. Write a Java program to print an American flag on the screen.
import java.lang.*;

class A1_14
{
	public static void main(String[] args)  
	{
		for(int i=1; i<=15;i++)
		{
			if(i<=6)
			{
				if(i%2==1)
				{
					System.out.println("* * * * * * = = = = = = = = = = = = = = =");
				}
				else
				{
					System.out.println(" * * * * *  = = = = = = = = = = = = = = =");
				}
			}
			else
			{
				    System.out.println("= = = = = = = = = = = = = = = = = = = = =");
			}
		}
		
	}	

}
	
