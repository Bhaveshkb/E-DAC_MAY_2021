/*
A 
B B
C C C
D D D D
E E E E E
*/
class A2_5 {
    public static void main(String args[])
    {
        int ch=65;
        for(int i=1;i<=5;i++)  // row
        {
            for(int j=1;j<=i;j++) // col
            {
                System.out.print((char)(ch)+" ");
            }
            System.out.println();
            ch++;
        }

    }    
}
