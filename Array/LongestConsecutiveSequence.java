public static int longestSuccessiveElements(int []a) {
        // Write your code here. //optimal
        int largest=1;
        int n=a.length;
        if(n==0) return 0;
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            s.add(a[i]);
        }
        for(int it:s)
        {
            if(!s.contains(it-1))
            {
                int cnt=1,x=it;
                while(s.contains(x+1))
                {
                    x+=1;
                    cnt+=1;
                }
                largest=Math.max(largest,cnt);
            }
        }
        return largest;
    }

//BRUTE
public int longestConsecutive(int[] nums) {
        int longest=0;
        for(int i=0;i<nums.length;i++)
        {
            int x=nums[i];
            int cnt=1;
            while(LinearSearch(nums,x+1)==true)
            {
                x+=1;
                cnt++;
            }
            longest=Math.max(longest,cnt);
        }
        return longest;
    }
    private boolean LinearSearch(int[] nums,int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
                return true;
        }
        return false;
    }

//BETTER
public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int cnt=0,lastSmallest=Integer.MIN_VALUE,longest=0;
        for(int i=0;i<nums.length;i++)
        {
            if((nums[i]-1)==lastSmallest)
            {
                cnt++;
                lastSmallest=nums[i];
            }
            else if(nums[i]!=lastSmallest)
            {
                cnt=1;
                lastSmallest=nums[i];
            }
            longest=Math.max(longest,cnt);
        }
        return longest;
    }

//OUTPUT
100,4,200,1,2,3
  4
