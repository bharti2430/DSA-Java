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

        public void nextPermutation(int[] nums) {
        int index=-1;
        final int n=nums.length;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                index=i;
                break;
            }
        }
        if(index>=0)
        {
            for(int i=n-1;i>=index;i--)
            {
                if(nums[i]>nums[index])
                {
                    swap(nums,i,index);
                    break;
                }
            }
        }
        reverse(nums,index+1,n-1);
    }
    private void swap(int [] nums,int a,int b)
    {
        final int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    private void reverse(int[] nums,int start,int end)
    {
        while(start<end)
        {
            swap(nums,start,end);
            start++;
            end--;
        }
    }
