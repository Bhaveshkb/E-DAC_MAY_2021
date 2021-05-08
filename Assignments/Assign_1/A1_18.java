/*
18. Write a Java program to multiply two binary numbers.
Input Data:
Input the first binary number: 10
Input the second binary number: 11
Expected Output
Product of two binary numbers: 110
*/
import java.util.*;
import java.lang.*;

class A1_18 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Binary Number: ");
        String x=sc.nextLine();
        System.out.println("Enter 2nd Binary Number: ");
        String y=sc.nextLine();
        
        int n1=Integer.parseInt(x,2);
        int n2=Integer.parseInt(y,2);
        int n3=n1*n2;

        System.out.println("n1 :"+Integer.toBinaryString(n1));
        System.out.println("n2 :"+Integer.toBinaryString(n2));
        System.out.println("n3=n1*n2 ="+Integer.toBinaryString(n3));
    }
}
