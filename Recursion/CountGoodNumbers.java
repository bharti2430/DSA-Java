class Solution {
    int mod=1000000007;
    public int countGoodNumbers(long n) {
        long numOfFives = (n + 1) / 2;
        long numOfFours = n / 2;
        
        // Calculate (5^numOfFives) % mod
        long a = myPow(5, numOfFives, mod);
        // Calculate (4^numOfFours) % mod
        long b = myPow(4, numOfFours, mod);
        
        // Return (a * b) % mod
        return (int) ((a * b) % mod);
    }
    private long myPow(int x,long n,int mod){
        if(n==0)
            return 1;
        if(n==1)
            return x;
        long half = myPow(x, n / 2, mod);
        half = (half * half) % mod;

        if (n % 2 != 0) {
            half = (half * x) % mod;
        }
        return half;
    }
}

Input: n = 1
Output: 5
Explanation: The good numbers of length 1 are "0", "2", "4", "6", "8".

Input: n = 4
Output: 400
