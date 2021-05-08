/*
                            A
                           A B   
                          A B C  
                         A B C D 
                        A B C D E
*/
import java.lang.*;
class A2_9 {
    public static void main(String args[])
    {
        int ch=64;
       
        for(int i=1;i<=5;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(" "+(char)(ch=ch+1));
            }
            System.out.println();
            ch=64;
        }
    }
}
