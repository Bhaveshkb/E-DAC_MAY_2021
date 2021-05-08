/*
A 
A B
A B C
A B C D
A B C D E
A B C D E F
*/
class A2_2
{
     public static void main(String args[])
    {
        int ch=64;
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(ch=ch+1)+" ");
            }
            System.out.println();
            ch=64;
        }
    }
    
}
