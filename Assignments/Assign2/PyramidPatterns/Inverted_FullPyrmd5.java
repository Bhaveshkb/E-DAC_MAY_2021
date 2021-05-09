class Inverted_FullPyrmd5 {

	public static void main(String[] args) 
	{
		int i,j,k,n=6;
		for(i=0;i<=n;i++)
		{
			for(k=0;k<=i;k++) 
			{
				System.out.print(" ");
			}
			for(j=1;j<=n-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}


	}

}
