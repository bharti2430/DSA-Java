public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        int low=boards.get(0),high=0;
        for(int i=0;i<boards.size();i++){
            low=Math.max(low,boards.get(i));
            high+=boards.get(i);
        }
        while(low<=high){
            int mid=(low+high)/2;
            int painters=findPossiblePainters(boards, mid);
            if(painters<=k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    private static int findPossiblePainters(ArrayList<Integer> arr,int totalTime){
        int painters=1,timeTaken=0;
        for(int i=0;i<arr.size();i++){
            if(timeTaken+arr.get(i)<=totalTime){
                timeTaken+=arr.get(i);
            }else{
                painters++;
                timeTaken=arr.get(i);
            }
        }
        return painters;
    }

Sample Input 1 :
4 2
10 20 30 40

Sample Output 1 :
60
