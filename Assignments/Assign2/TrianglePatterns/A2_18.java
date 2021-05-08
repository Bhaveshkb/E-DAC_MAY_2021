/*
A B C D E 
A B C D
A B C
A B
A
*/
class A2_18 {
    public static void main(String args[])
    {
        int ch=65;
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print((char)(ch++)+" ");
            }
            System.out.println();
            ch=65;
        }
    }
}
