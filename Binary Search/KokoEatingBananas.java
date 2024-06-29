public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=maxElement(piles);
        while(low<=high){
            int mid=(low+high)/2;
            long totalHours=requiredTime(piles,mid);
            if(totalHours<=h)
                high=mid-1;
            else
                low=mid+1;
        }
        return low;
    }
    private int maxElement(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        return max;
    }
    private long requiredTime(int[] arr,int k){
        long totalHours=0;
        for(int i=0;i<arr.length;i++){
            totalHours+=Math.ceil((double)arr[i]/k);
        }
        return totalHours;
    }

Input: piles = [3,6,7,11], h = 8
Output: 4

Input: piles = [30,11,23,4,20], h = 5
Output: 30
