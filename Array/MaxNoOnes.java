import java.util.*;
public class MaxNoOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		int count=0,maxOnes=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==1)
			{
				count++;
				maxOnes=Math.max(maxOnes, count);
			}
			else
				count=0;
		}
		System.out.println("Maximum consecutive ones are "+maxOnes);
	}

}
