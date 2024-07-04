//BRUTE
public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        int[] combined=new int[n1+n2];
        int i=0,j=0;
        int c=0;
        while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j]){
                combined[c++]=nums1[i];
                i++;
            }
            else{
                combined[c++]=nums2[j];
                j++;
            }
        }
        while(i<n1){
            combined[c++]=nums1[i];
            i++;
        }
        while(j<n2){
            combined[c++]=nums2[j];
            j++;
        }
        int n=n1+n2;
        if(n%2==1){
            return (double)(combined[n/2]);
        }else{
            return (double)((double)(combined[n/2-1]+combined[n/2])/2);
        }
    }

// better without extra space
public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        int i=0,j=0;
        int n=n1+n2;
        int cnt=0,ind1=n/2-1,ind2=n/2,ind1el=0,ind2el=0;
        while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j]){
                if(cnt==ind1) ind1el=nums1[i];
                if(cnt==ind2) ind2el=nums1[i];
                cnt++;
                i++;
            }
            else{
                if(cnt==ind1) ind1el=nums2[j];
                if(cnt==ind2) ind2el=nums2[j];
                cnt++;
                j++;
            }
        }
        while(i<n1){
            if(cnt==ind1) ind1el=nums1[i];
            if(cnt==ind2) ind2el=nums1[i];
            cnt++;
            i++;
        }
        while(j<n2){
            if(cnt==ind1) ind1el=nums2[j];
            if(cnt==ind2) ind2el=nums2[j];
            cnt++;
            i++;
        }
        if(n%2==1){
            return (double)(ind2el);
        }else{
            return (double)((double)(ind1el+ind2el)/2);
        }
    }

//optimal using BS
public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        int n=n1+n2;
        //if n1 is bigger swap the arrays
        if(n1>n2) return findMedianSortedArrays(nums2,nums1);
        int left = (n1 + n2 + 1) / 2; //length of left half
        int low=0,high=n1;
        while(low<=high){
            int mid1 = (low + high) / 2;
            int mid2 = left - mid1;
            //calculate l1, l2, r1 and r2;
            int l1 = (mid1 > 0) ? nums1[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? nums2[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1) ? nums1[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2) ? nums2[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 1) return Math.max(l1, l2);
                else return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            } else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0;
    }

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
