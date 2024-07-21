public int minChanges(int n, int k) {
        // Check if k is achievable from n
        if(k>n) return -1;
        // Check if all bits set in k are also set in n
        if ((n & k) != k) return -1;
        // Count the number of bits set in n but not in k
        int count = 0;
        int diff = n ^ k; // XOR to find differing bits
        while (diff != 0) {
            count += diff & 1;
            diff >>= 1;
        }
        
        return count;
    }

Input: n = 13, k = 4
Output: 2

Input: n = 21, k = 21
Output: 0
