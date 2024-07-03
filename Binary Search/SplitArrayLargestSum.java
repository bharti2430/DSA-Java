public int splitArray(int[] nums, int k) {
        int low=nums[0],high=0;
        for(int i=0;i<nums.length;i++){
            low=Math.max(nums[i],low);
            high+=nums[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            int partition=findPossibleSplit(nums,mid);
            if(partition<=k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    private int findPossibleSplit(int[] nums,int sum){
        int split=1,subarraySum=0;
        for(int i=0;i<nums.length;i++){
            if(subarraySum+nums[i]<=sum){
                subarraySum+=nums[i];
            }else{
                split++;
                subarraySum=nums[i];
            }
        }
        return split;
    }

Input: nums = [7,2,5,10,8], k = 2
Output: 18
