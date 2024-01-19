import java.util.*;
class PairOfArray
{
	int first;
	int second;
	public PairOfArray(int first,int second)
	{
		this.first=first;
		this.second=second;
	}
	public void display()
	{
		System.out.print("("+first+","+second+") ");
	}
}
class FindPairs
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements= ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Total distinct pairs of Array:");
		for(int i=0;i<n;i++)
		{
			int current=arr[i];
			for(int j=i+1;j<n;j++)
			{
				PairOfArray ob=new PairOfArray(current,arr[j]);
				ob.display();
			}
			System.out.println();
		}
	}
}
