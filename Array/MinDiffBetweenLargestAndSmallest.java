// Return the minimum difference between the largest and smallest value of nums after performing at most three moves.
public int minDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(nums.length<=4) return 0;
        // new array for difference values
        int[] values = new int[4];

        //following the 4 psbl cases
        values[0] = nums[n - 4] - nums[0];
        values[1] = nums[n - 3] - nums[1];
        values[2] = nums[n - 2] - nums[2];
        values[3] = nums[n - 1] - nums[3];

        int mini = values[0];

        for (int val : values)
            mini = Math.min(val, mini);
        return mini;
    }

Input: nums = [5,3,2,4]
Output: 0
Input: nums = [1,5,0,10,14]
Output: 1
