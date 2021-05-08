class Pyramid5 {
    public static void main(String args[]){
        int i,j,k,l;
        for(i=9;i>=1;i--)
        {
        for(j=1;j<=i-1;j++)
        {
            System.out.print("  ");
        }
        for(k=i;k<=9;k++)
        {
            System.out.print(" "+k);  
        }
        for(l=8;l>=i;l--)
        {
            System.out.print(" "+l);
        }
        System.out.println();
    } 
 }   
}
