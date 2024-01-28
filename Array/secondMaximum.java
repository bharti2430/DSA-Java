class secondMaximum
{
	public static void main(String[] args)
	{
		int[] arr={23};
		int n=arr.length;
		int l=arr[0];
		int sl=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>l)
			{
				sl=l;
				l=arr[i];
			}
			else
				sl=arr[i];
		}
		System.out.println("Largest= "+l+"\nSecond Largest= "+sl);
	}
}
