public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        if(n>m) return kthElement(arr2,arr1,m,n,k);
        int low=Math.max(0,k-m),high=Math.min(n,k);
        int left=k;
        while(low<=high){
            int mid1=(low+high)/2;
            int mid2=left-mid1;
            int l1=Integer.MIN_VALUE,l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE,r2=Integer.MAX_VALUE;
            if(mid1<n) r1=arr1[mid1];
            if(mid2<m) r2=arr2[mid2];
            if(mid1-1>=0) l1=arr1[mid1-1];
            if(mid2-1>=0) l2=arr2[mid2-1];
            if(l1<=r2 && r1>=l2){
                return Math.max(l1,l2);
            }
            else if(l1>r2){
                high=mid1-1;
            }else{
                low=mid1+1;
            }
        }
        return 0;
    }

Input:
arr1[] = {2, 3, 6, 7, 9}
arr2[] = {1, 4, 8, 10}
k = 5
Output:
6
