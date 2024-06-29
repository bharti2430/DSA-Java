// all element appears twice except one
//brute 1
public int singleNonDuplicate(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        return xor;
    }

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2

//brute 2
public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(nums[0]!=nums[1])
                    return nums[0];
            }
            else if(i==nums.length-1){
                if(nums[nums.length-1]!=nums[nums.length-2])
                    return nums[nums.length-1];
            }
            else {
                    if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1])
                        return nums[i];
            }
        }
        return -1;
    }

//optimal
public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        int low=1,high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])
                return nums[mid];
            if((mid%2!=0 && nums[mid]==nums[mid-1]) || (mid%2==0 && nums[mid]==nums[mid+1]))
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
