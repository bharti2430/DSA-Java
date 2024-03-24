public int[] rearrangeArray(int[] nums) {
        int[] ans=new int[nums.length];
        int posIndex=0,negIndex=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                ans[negIndex]=nums[i];
                negIndex+=2;
            }
            else{
                ans[posIndex]=nums[i];
                posIndex+=2;
            }
        }
        return ans;
    }

//output
Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
