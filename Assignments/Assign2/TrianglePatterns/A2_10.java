/*
                        E 
                       D E
                      C D E
                     B C D E
                    A B C D E

*/
class A2_10 {
    public static void main(String args[])
    {
        int ch=64;
		for(int i=5;i>=1;i--)
        {
            for(int j=2;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<=5;k++)
            {
                System.out.print((char)(ch+k)+" ");
            }
            System.out.println();
        } 
    }    
}
