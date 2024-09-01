public static long kSub(int k, List<Integer> nums) {
        long res = 0;
    int sum = 0;
    Map<Integer, Integer> remainderMap = new HashMap<>();
    remainderMap.put(0, 1); // Initialize with 0 remainder

    for (int num : nums) {
        sum += num;
        int remainder = sum % k;

        // Handle negative remainders by converting them to positive
        if (remainder < 0) {
            remainder += k;
        }

        // If the remainder has been seen before, increment the result by the count
        if (remainderMap.containsKey(remainder)) {
            res += remainderMap.get(remainder);
        }

        // Update the remainder count in the map
        remainderMap.put(remainder, remainderMap.getOrDefault(remainder, 0) + 1);
    }

    return res;
    }

// Example
k=3 array={1,2,3,4,1}
output: 4
The 4 subarrays of nums having sums that are evenly divisible by k = 3 are {3}, {1, 2}, {1, 2, 3}, {2, 3, 4}.
