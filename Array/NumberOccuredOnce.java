import java.util.*;
public class NumberOccuredOnce {
	public static void bruteForce(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int count=0,num=arr[i];
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==num)
					count++;
			}
			if(count==1)
				System.out.println(num+" occured only once");
		}
	}
	public static void HashArray(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			max=Math.max(max, arr[i]);
		}
		int hash[]=new int[max+1];
		for(int i=0;i<arr.length;i++)
		{
			hash[arr[i]]++;
		}
		for(int i=hash[0];i<max+1;i++)
		{
			if(hash[arr[i]]==1)
				System.out.println(arr[i]+" occured only once.");
		}
	}
	public static void HashMapping(int arr[])
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			int value=map.getOrDefault(arr[i],0);
			map.put(arr[i], value+1);
		}
		System.out.println(map);
		for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() == 1) {
                System.out.println(it.getKey()+" occured only once");
            }
		}
	}
	public static void optimal(int arr[])
	{
		int XOR=0;
		for(int i=0;i<arr.length;i++)
		{
			XOR=XOR^arr[i];
		}
		System.out.println(XOR+" occured only once.");
	}
	
public static void main(String[] args) {
		int arr[]= {1,1,2,3,3,4,4,8,8};
		//bruteForce(arr);
		//HashArray(arr);
		//HashMapping(arr);
		optimal(arr);
	}
}
