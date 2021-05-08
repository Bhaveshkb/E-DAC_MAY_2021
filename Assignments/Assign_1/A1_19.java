/*
19. Write a Java program to convert a decimal number to binary number.
Input Data:
Input a Decimal Number : 5
Expected Output
Binary number is: 101
*/
import java.util.*;
import java.lang.*;
class A1_19 {
    static void DecToBinary(int n)
    {
        int[] binary = new int[1000];
        int i = 0;
        int b=n;
        while (n > 0) 
        {
            binary[i] = n%2;
            n = n/2;
            i++;
        }
        System.out.println("Binary number of "+b+"is ");
        // printing binary in reverse order
        for (int j = i-1; j>=0; j--)
            System.out.print(binary[j]);
    }
      
        public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal Number : ");
        int n=sc.nextInt();
        DecToBinary(n);
    }
}
  

    

