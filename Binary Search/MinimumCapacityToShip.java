//BRUTE
public int shipWithinDays(int[] weights, int days) {
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<weights.length;i++){
            max=Math.max(weights[i],max);
            sum+=weights[i];
        }
        for(int cap=max;cap<=sum;cap++){
            if(daysToShip(weights,cap)<=days)
                return cap;
        }
        return -1;
    }
    public int daysToShip(int[] weights,int cap){
        int days=1,load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]<=cap){
                load+=weights[i];
            }
            else{
                days++;
                load=weights[i];
            }
        }
        return days;
    }

//OPTIMAL
public int shipWithinDays(int[] weights, int days) {
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<weights.length;i++){
            max=Math.max(weights[i],max);
            sum+=weights[i];
        }
        int low=max,high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            int reqDays=daysToShip(weights,mid);
            if(reqDays<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
Output: 15
