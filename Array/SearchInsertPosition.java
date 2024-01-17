public int searchInsert(int[] arr, int target) {
        int n=arr.length;
        int start=0,end=n-1;
        
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==target)
                return mid;
            if(arr[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        return start;
    }
}
