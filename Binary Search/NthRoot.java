// return 1 if power==m
    // return 0 if power<m
    // return 2 if power>m
    private int findPower(int mid,int n,int m){
        long ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*mid;
            if(ans>m) return 2;
        }
        if(ans==m) return 1;
        return 0;
    }
    public int NthRoot(int n, int m)
    {
        int low=1,high=m;
        while(low<=high){
            int mid=(low+high)/2;
            int ans=findPower(mid,n,m);
            if(ans==1) return mid;
            else if(ans==0) low=mid+1;
            else if(ans==2) high=mid-1;
        }
        return -1;
    }
}
