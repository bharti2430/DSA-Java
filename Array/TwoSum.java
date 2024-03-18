public class TwoSum {
	public static void brute(int arr[],int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]+arr[j])==target)
				{
					System.out.println(arr[i]+"+"+arr[j]+" = "+target);
					return;
				}
			}
		}
		System.out.println("Numbers not found for target.");
	}
	public static void better(int arr[],int target)
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			int more=target-arr[i];
			if(map.containsKey(more))
			{
				System.out.println((arr[i]+"+"+more)+"= "+target);
				System.out.println("Found at index "+map.get(more)+" and "+i);
				return;
			}
			map.put(arr[i], i);
		}
	}
	public static void optimal(int arr[],int target)
	{
		int l=0,r=arr.length-1;
		Arrays.sort(arr);
		while(l<r)
		{
			int sum=arr[l]+arr[r];
			if(sum==target) {
				System.out.println(arr[l]+" + "+arr[r]+" = "+sum);
				return;
			}
			else if(sum<target) l++;
			else r--;
		}
	}
}
