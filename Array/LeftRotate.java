public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int n=arr.size();
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
        return arr;
    }
    public static void reverse(ArrayList<Integer> arr,int start,int end)
    {
        while(start<=end)
        {
            Collections.swap(arr,start,end);
            start++;
            end--;
        }
    }
