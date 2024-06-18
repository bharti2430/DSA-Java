//using lower and upper bound
public int[] searchRange(int[] nums, int target) {
        int[] result=new int[2];
        int first=lowerBound(nums,target);
        if((first==nums.length) || nums[first]!=target){
            result[0]=-1;
            result[1]=-1;
            return result;
        }
        result[0]=first;
        result[1]=upperBound(nums,target)-1;
        return result;
    }
    private static int lowerBound(int[] arr,int target){
        int low=0,high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                ans = mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    private static int upperBound(int[] arr,int target){
        int low=0,high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                ans =mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

//using simple binary search
public int[] searchRange(int[] nums, int target) {
        int[] result=new int[2];
        result[0]=firstOccurence(nums,target);
        result[1]=lastOccurence(nums,target);
        return result;
    }
    private static int firstOccurence(int[] arr,int target){
        int low=0,high=arr.length-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                first = mid;
                high=mid-1;
            }
            else if(arr[mid]>target)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return first;
    }
    private static int lastOccurence(int[] arr,int target){
        int low=0,high=arr.length-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                last =mid;
                low=mid+1;
            }
            else if(arr[mid]>target)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return last;
    }
