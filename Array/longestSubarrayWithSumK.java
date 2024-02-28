//brute force
public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int length =0,n=a.length;
        for(int i=0;i<n;i++)
        {
            long sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=a[j];
                if(sum==k)
                {
                    length=Math.max(length,j-i+1);
                }
            }        
        }
        return length;
    }

//better
public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int length =0,n=a.length;
        HashMap<Long,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            long sum=0;
            sum+=a[i];
            if(sum==k)
            {
                length=Math.max(length,i+1);
            }
            long rem=sum-k;
            if(map.containsKey(rem))
            {
                int len=i-map.get(rem);
                length=Math.max(length,len);
            }
            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }
        }
        return length;
    }
