public int searchInsert(int[] arr, int target) {
        int n=arr.length;
        int start=0,end=n-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]>=target)
                end=mid-1;
            else
                start=mid+1;
        }
        return start;
    }

Input: nums = [1,3,5,6], target = 5
Output: 2

Input: nums = [1,3,5,6], target = 2
Output: 1
