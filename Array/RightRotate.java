//optimal
public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-k-1);
        reverse(nums,0,n-1);
    }
    public void reverse(int[] arr,int start,int end)
    {
        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

//bruteforce
while(k>0)
        {
                int temp=nums[n-1];
                for(int i=(n-1);i>0;i++)
                        {
                                nums[i]=nums[i-1];
                        }
                nums[0]=temp;
                k--;
        }
