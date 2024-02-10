import java.util.Scanner;

public class FastExponentiation {
	public static int exponent(int a,int n)
	{
		int ans=1;
		while(n>0)
		{
			if((n&1)!=0)
				ans=ans*a;
			a=a*a;
			n=n>>1;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of a= ");
		int a=sc.nextInt();
		System.out.print("Enter the value of p= ");
		int p=sc.nextInt();
		int e=exponent(a,p);
		System.out.println(a+" to the power of "+p+" is "+e);
		sc.close();
	}

}

//output

Enter the value of a= 3
Enter the value of p= 5
3 to the power of 5 is 243

