public static void quickSort(int[] a,int low, int high) {
		int r;
		if(low<high){
			r=partition(a, low, high);
			quickSort(a,low,r-1);
			quickSort(a, r+1, high);
		}
	}
public static int partition(int[] a,int low,int high)
	{
		int i=low,temp;
		int x=a[low];
		for(int j=low+1;j<=high;j++)
		{
			if(a[j]<=x)
			{
				i++;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		temp=a[i];
		a[i]=a[low];
		a[low]=temp;
		return i;
	}
