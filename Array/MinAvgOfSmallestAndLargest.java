// You have an array of floating point numbers averages which is initially empty. You are given an array nums of n integers where n is even.
// You repeat the following procedure n / 2 times:
// Remove the smallest element, minElement, and the largest element maxElement, from nums.
// Add (minElement + maxElement) / 2 to averages.
// Return the minimum element in averages.

// 1
public double minimumAverage(int[] nums) {
        int n=nums.length;
        double[] averages=new double[n/2];
        Arrays.sort(nums);
        int left=0,right=n-1,i=0;
        while(left<right){
            int a=nums[left];
            int b=nums[right];
            double res=(a+b)/2.0;
            averages[i++]=res;
            left++;
            right--;
        }
        double min=Double.MAX_VALUE;
        for(int j=0;j<averages.length;j++){
            min=Math.min(min,averages[j]);
        }
        return min;
    }

Input: nums = [7,8,3,4,15,13,4,1]

Output: 5.5

Explanation:

step	nums	averages
0	[7,8,3,4,15,13,4,1]	[]
1	[7,8,3,4,13,4]	[8]
2	[7,8,4,4]	[8,8]
3	[7,4]	[8,8,6]
4	[]	[8,8,6,5.5]

// 2
public double minimumAverage(int[] nums) {
    int n=nums.length;
    Arrays.sort(nums);
    int left=0,right=n-1;
    double min=Double.MAX_VALUE;
    while(left<right){
        int a=nums[left];
        int b=nums[right];
        double res=(a+b)/2.0;
        min=Math.min(res,min);
        left++;
        right--;
    }
    return min;
}
