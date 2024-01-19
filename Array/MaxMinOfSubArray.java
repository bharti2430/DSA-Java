import java.util.*;
class MaxMinOfSubArray
{
	public static void main(String args[])
	{
		int arr[]={1,5,8,3,9};
		int n=arr.length;
		int max=0,min=Integer.MAX_VALUE;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int sum=0;
				for(int k=i;k<=j;k++)
				{
					sum+=arr[k];
					System.out.print(arr[k]+" ");	
				}
				System.out.print("___>>>>>Sum of this subarray= "+sum);
				if(sum>max)
					max=sum;
				if(sum<min)
					min=sum;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Maximum of all the subarrays= "+max);
		System.out.println("Minimum of all the subarrays= "+min);
	}
}
