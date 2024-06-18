public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            //left sorted
            if(nums[low]<=nums[mid]){
                min=Math.min(min,nums[low]);
                low=mid+1;
            }
            else{
                min=Math.min(min,nums[mid]);
                high=mid-1;
            }
        }
        return min;
    }

Input: nums = [3,4,5,1,2]
Output: 1

//search space is already sorted
//then arr[low] will always be
//the minimum in that search space:
if (arr[low] <= arr[high]) {
        ans = Math.min(ans, arr[low]);
        break;
}
