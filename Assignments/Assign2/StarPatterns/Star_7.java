/*
                            *
                           ***
                          *****
                         *******
                        *********
                         *******
                          *****
                           ***
                            *
*/
class Star_7 {
    
        public static void main(String args[])
        {
            for(int i=1; i<=5;i++)
            {
                for(int j=5;j>=i;j--)
                {
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++)
                {
                    System.out.print("*");
                }
                for(int l=2;l<=i;l++)
                {
                    System.out.print("*");
                    
                }
                System.out.println("");
            }
        
            for(int i=2;i<=5;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(" ");
                }
                for(int k=5;k>=i;k--)
                {
                    System.out.print("*");
                }
                for(int l=3;l>=i-1;l--)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    

