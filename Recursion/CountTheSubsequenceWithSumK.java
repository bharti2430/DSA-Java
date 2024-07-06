public int perfectSum(int arr[],int n, int sum) 
	{ 
	    return Helper(arr,0,0,sum);
	}
	private int Helper(int arr[],int index,int k,int sum){
	    if(index==arr.length){
	        if(sum==k) return 1;
	        return 0;
	    }
	    // Take case
	    k+=arr[index];
	    int l=Helper(arr,index+1,k,sum);
	    // Not taking case
	    k-=arr[index];
	    int r=Helper(arr,index+1,k,sum);
	    return (l+r);
	}

Input: 
n = 6, arr = [5, 2, 3, 10, 6, 8], sum = 10
Output: 
3
Explanation: 
{5, 2, 3}, {2, 8}, {10} are possible subsets.
