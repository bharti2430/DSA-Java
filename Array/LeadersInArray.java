public static List< Integer > superiorElements(int []a) {
        // Write your code here.  //optimal
        List<Integer> ans=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]>max)
            {
                ans.add(a[i]);
            }
            max=Math.max(max,a[i]);
        }
        return ans;
    }

//output
Sample Input 1:
4 
1 2 2 1


Sample Output 1:
1 2


Explanation of Sample Input 1:
Element present at the last index is '1' and is a superior element since there are no integers to the right of it.
Element present at index 2 (0-indexed) is '2' and is greater than all the elements to the right of it.
There are no other superior elements present in the array.
Hence the final answer is [1,2].
