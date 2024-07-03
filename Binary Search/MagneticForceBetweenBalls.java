// Aggressive cows approach
public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low=1,high=position[position.length-1]-position[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(canWePlace(position,mid,m)){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }
    private boolean canWePlace(int[] position,int dist,int m){
        int ballsCount=1,place=position[0];
        for(int i=1;i<position.length;i++){
            if(position[i]-place>=dist){
                ballsCount++;
                place=position[i];
            }
        }
        return ballsCount>=m;
    }

Input: position = [1,2,3,4,7], m = 3
Output: 3
