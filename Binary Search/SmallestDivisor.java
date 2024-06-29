public int smallestDivisor(int[] nums, int threshold) {
        int low=1,high=maxEl(nums);
        int divisor=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int sum=findSum(nums,mid);
            if(sum<=threshold){
                divisor=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return divisor;
    }
    private int maxEl(int[] nums){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            ans=Math.max(ans,nums[i]);
        } 
        return ans;
    }
    private int findSum(int[] nums,int div){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double)nums[i]/div);
        }
        return sum;
    }

Input: nums = [1,2,5,9], threshold = 6
Output: 5
Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1. 
If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2). 

Input: nums = [44,22,33,11,1], threshold = 5
Output: 44
