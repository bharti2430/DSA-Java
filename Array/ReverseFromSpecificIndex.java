public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        int start = m+1;
        int end = arr.size()-1;
        while(start<end){            
            Collections.swap(arr,start,end);            
            start += 1;            
            end -= 1;
        }
    }

//output
1 2 3 4 5 6
3
1 2 3 4 6 5
