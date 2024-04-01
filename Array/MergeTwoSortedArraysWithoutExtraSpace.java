//OPTIMAL 1

public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){
        // Write your code here.
        int n=a.length;
        int m=b.length;
        int left=n-1,right=0;
        while(left>=0 && right<m)
        {
            if(a[left]>b[right]){
                long temp=a[left];
                a[left]=b[right];
                b[right]=temp;
                left--;
                right++;
            }
            else break;
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }

//OPTIMAL 2

public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b)
    {
        int n=a.length;
        int m=b.length;
        int len=(m+n);
        int gap=(len/2)+(len%2);
        while(gap>0)
        {
            int left=0;
            int right=left+gap;
            while(right<len)
            {
                if(left<n && right>=n) //a&b array
                {
                    swapIfGreater(a,b,left,right-n);
                }   
                else if(left>=n)     //b&b array
                {
                    swapIfGreater(b,b,left-n,right-n);
                }
                else                //a&a array
                {
                    swapIfGreater(a,a,left,right);
                }
                left++;
                right++;
            }
            if(gap==1) break;
            gap=(gap/2)+(gap%2);
        }
    }
    private static void swapIfGreater(long[] a,long[] b,int ind1,int ind2)
    {
        if(a[ind1]>b[ind2])
        {
            long temp=a[ind1];
            a[ind1]=b[ind2];
            b[ind2]=temp;
        }
    }
