// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
		long low=1,high=x;
		long ans=1;
		while(low<=high){
		    long mid=(low+high)/2;
		    if((mid*mid)<=x){
		        ans=mid;
		        low=mid+1;
		    }
		    else{
		        high=mid-1;
		    }
		}
		return ans;
	 }
}

