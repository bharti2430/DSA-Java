public int maxSubArray(int[] nums) {
        int n=nums.length;
        int ms=Integer.MIN_VALUE,cs=0;
        for(int i=0;i<n;i++)
        {
            cs=Math.max(nums[i],cs+nums[i]);
            ms=Math.max(cs,ms);
        }
        return ms;
    }
