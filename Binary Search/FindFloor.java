static int findFloor(long arr[], int n, long x)
    {
        int low=0,high=n-1;
        long ans=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]<=x)
            {
                ans=arr[mid];
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if (ans == -1) {
            return -1;
        }
        return (int)ans;
    }

Input: n = 7, x = 0 arr[] = {1,2,8,10,11,12,19}
Output: -1
Input: n = 7, x = 5 arr[] = {1,2,8,10,11,12,19}
Output: 1
