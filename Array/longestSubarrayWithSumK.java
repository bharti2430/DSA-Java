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

//better (also works as optimal solution for negative elements present in an array)
public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int length =0,n=a.length;
        long sum=0;
        HashMap<Long,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
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

//Optimal solution

public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int n=a.length,left=0,right=0,maxLen=0;
        long sum=a[0];
        while(right<n)
        {
            while(left<=right && sum>k)
            {
                sum-=a[left];
                left++;
            }
            if(sum==k)
                maxLen=Math.max(maxLen,right-left+1);
            right++;
            if(right<n) sum+=a[right];
        }
        return maxLen;
    }
