class HollowStar
{
	public static void main(String[] args)
	{
		int n=5;
		int space1=0,space2=2*(n-1);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<space1;j++)
            {
                System.out.print(" ");
            }
            space1+=2;
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<space2;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            space2-=2;
            System.out.println();
        }
	}
}

//output

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
