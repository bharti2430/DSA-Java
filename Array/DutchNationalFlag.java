public static void sortArray(ArrayList<Integer> arr, int n) {
        int l=0,m=0,r=n-1;
        while(m<=r)
        {
            if(arr.get(m)==0)
            {
                Collections.swap(arr,l,m);
                l++;
                m++;
            }
            else if(arr.get(m)==1)
            {
                m++;
            }
            else
            {
                Collections.swap(arr,m,r);
                r--;
            }
        }
    }
