/*
                            *
                           **
                          * *
                         *  *
                        *****

*/
class Star_16 {
    public static void main(String args[])
    {
        int i,j,rows=5;
        for(i=1; i<=rows; i++)
        {
            for(j=i; j<rows; j++)
            {
                System.out.print(" ");
            }
    
            for(j=1; j<=i; j++)
            {
                if(i==rows || j==1 || j==i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
    
            System.out.println();
        }
    }
}
