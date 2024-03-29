public static int getLongestZeroSumSubarrayLength(int []arr){
        // Write your code here.
        int n=arr.length,sum=0,maxi=0;
       HashMap<Integer,Integer> mpp = new HashMap<>();
       for(int i=0;i<n;i++)
       {
           sum+=arr[i];
           if(sum==0) maxi=i+1;
           else {
               if(mpp.get(sum)!=null)
               {
                   maxi=Math.max(maxi,i-mpp.get(sum));
               }
               else
               {
                   mpp.put(sum,i);
               }
           }
       }
        return maxi;
    }
