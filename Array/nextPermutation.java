public static List< Integer > nextGreaterPermutation(List< Integer > A) {
        int index=-1;
        int n=A.size();
        for(int i=n-2;i>=0;i--)
        {
            if(A.get(i)<A.get(i+1))
            {
                index=i;
                break;
            }
        }
        if(index==-1)
        {
            Collections.reverse(A);
            return A;
        }
        for(int i=n-1;i>=index;i--)
        {
            if(A.get(i)>A.get(index))
            {
                Collections.swap(A,i,index);
                break;
            }
        }
         List<Integer> sublist = A.subList(index + 1, n);
         Collections.reverse(sublist);
        return A;
    }

//output
Input:
A = [3, 1, 2]
Output:
3 2 1
