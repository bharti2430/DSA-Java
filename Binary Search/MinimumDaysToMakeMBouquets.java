//BRUTE
public int minDays(int[] bloomDay, int m, int k) {
        int[] minmax=minMax(bloomDay);
        for(int i=minmax[0];i<=minmax[1];i++){
            if(possibleDay(bloomDay,i,m,k))
                return i;
        }
        return -1;
    }
    private int[] minMax(int[] arr){
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
            min=Math.min(arr[i],min);
        }
        int[] result={min,max};
        return result;
    }
    private boolean possibleDay(int[] bloomDay,int d,int m,int k){
        int cnt=0,bouquets=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=d){
                cnt++;
            }
            else{
                bouquets+=cnt/k;
                cnt=0;
            }
        }
        bouquets+=cnt/k;
        return bouquets>=m;
    }

//OPTIMAL
public int minDays(int[] bloomDay, int m, int k) {
        int[] minmax=minMax(bloomDay);
        long val=(long)m*k;
        if(val>bloomDay.length) return -1;
        int low=minmax[0],high=minmax[1];
        while(low<=high){
            int mid=(low+high)/2;
            if(possibleDay(bloomDay,mid,m,k))
                high=mid-1;
            else
                low=mid+1;
        }
        return low;
    }

Input: bloomDay = [1,10,3,10,2], m = 3, k = 1
Output: 3
Input: bloomDay = [1,10,3,10,2], m = 3, k = 2
Output: -1
