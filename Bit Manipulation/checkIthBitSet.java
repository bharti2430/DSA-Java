static boolean isKthBitSet(int n, int k) {
        // Write your code here.
        int bitMask=1<<(k-1);
        return ((n&bitMask)!=0);
    }
