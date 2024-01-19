static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<=n-k;i++)
        {
            int max=0;
            //int current=arr[i];
            for(int j=i;j<i+k;j++)
            {
                if(arr[j]>max)
                    max=arr[j];
            }
            result.add(max);
        }
        return result;
    }

//output

N = 9, K = 3
arr[] = 1 2 3 1 4 5 2 3 6
Output: 
3 3 4 5 5 5 6 
Explanation: 
1st contiguous subarray = {1 2 3} Max = 3
2nd contiguous subarray = {2 3 1} Max = 3
3rd contiguous subarray = {3 1 4} Max = 4
4th contiguous subarray = {1 4 5} Max = 5
5th contiguous subarray = {4 5 2} Max = 5
6th contiguous subarray = {5 2 3} Max = 5
7th contiguous subarray = {2 3 6} Max = 6
