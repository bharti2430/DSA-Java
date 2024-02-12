static long sequence(int n){
        long sum=0;
        long mod=1000000007;
        long num=1;
        for(int i=1;i<=n;i++)
        {
            long term=num;
            for(int j=1;j<=i;j++)
            {
                term=(term*num)%mod;
                num++;
            }
            sum=(sum+term)%mod;
        }
        return sum;
    }

//output

Input: n = 5
Output: 365527
Explanation: 
F(5) = 1 + 2*3 + 4*5*6 + 7*8*9*10 + 11*12*13*14*15 = 365527.
