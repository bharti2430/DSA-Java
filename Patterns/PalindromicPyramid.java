class PalindromicPyramid
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			int num=i+1;
			for(int j=1;j<=(2*i+1);j++)
			{
				System.out.print(num);
				if(j>(2*i+1)/2) num++;
				else num--;
			}
			System.out.println();
		}
	}
}

//output
     1
    212
   32123
  4321234
 543212345
