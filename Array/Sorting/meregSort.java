public static void mergeSort(int[] arr, int l, int r){
        if(l<r)
        {
            int mid=l+(r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
public static void merge(int[] arr,int l,int mid,int r)
    {
        int[] B=new int[r];
        mid=(l+r)/2;
        int k=mid+1,c=1;
        while(l<=mid && k<=r)
        {
            if(arr[l]<=arr[k])
            {
                B[c]=arr[l];
                l++;
            }
            else
            {
                B[c]=arr[k];
                k++;
            }
            c++;
        }
        while(l<mid)
        {
            B[c]=arr[l];
            l++;
            c++;
        }
        while(k<r)
        {
            B[c]=arr[k];
            k++;
            c++;
        }
        for(int i=l;i<r;i++)
            arr[i]=B[i-l];
    }
