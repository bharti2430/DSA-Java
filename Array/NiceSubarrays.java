public int numberOfSubarrays(int[] nums, int k) {
        int[] prefixCounts = new int[n + 1];
        prefixCounts[0] = 1; // There's one way to have 0 odd numbers initially
        int oddCount = 0;
        int result = 0;

        for (int num : nums) 
        {
            if (num % 2 != 0) 
            {
                oddCount++;
            }
            if (oddCount >= k) 
            {
                result += prefixCounts[oddCount - k];
            }
            prefixCounts[oddCount]++;
        }
        return result;
    }

// A continuous subarray is called nice if there are k odd numbers on it.
Input: nums = [1,1,2,1,1], k = 3
Output: 2
Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].
Input: nums = [2,4,6], k = 1
Output: 0
Explanation: There are no odd numbers in the array.
