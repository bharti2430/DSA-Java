import java.util.*;
class TrappingWater
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the numberb of bar= ");
		int n=sc.nextInt();
		int height[]=new int[n];
		System.out.println("Enter the height of each bar:");
		for(int i=0;i<n;i++)
			height[i]=sc.nextInt();
		int leftMax[]=new int[n];
		int rightMax[]=new int[n];
		leftMax[0]=height[0];
		rightMax[n-1]=height[n-1];
		for(int i=1;i<n;i++)
			leftMax[i]=Math.max(height[i],leftMax[i-1]);
		for(int i=n-2;i>=0;i--)
			rightMax[i]=Math.max(height[i],rightMax[i+1]);
		int trapWater=0;
		for(int i=0;i<n;i++)
		{
			int waterLevel=Math.min(leftMax[i],rightMax[i]);
			trapWater+=waterLevel-height[i];
		}
		System.out.println("Total trapped water= "+trapWater);
	}
}
