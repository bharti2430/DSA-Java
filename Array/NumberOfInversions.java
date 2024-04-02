public static int numberOfInversions(int []a, int n) {
        int cnt=mergeSort(a, 0, n-1);
        return cnt;
    }
        public static int mergeSort(int[] arr, int l, int r){
            int cnt=0;
        if(l<r)
        {
            int mid=l+(r-l)/2;
            cnt+=mergeSort(arr,l,mid);
            cnt+=mergeSort(arr,mid+1,r);
            cnt+=merge(arr,l,mid,r);
        }
        return cnt;
    }
public static int merge(int[] arr,int low,int mid,int high)
    {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //Modification 1: cnt variable to count the pairs:
        int cnt = 0;

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                cnt += (mid - left + 1); //Modification 2
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return cnt; // Modification 3
    }

//OUTPUT
Input:
A = [5, 3, 2, 1, 4], N = 5
Output:
7
the number of pairs of ‘i’, ‘j’ such that ‘i’ < ‘j’ and ‘A[i]’ > ‘A[j]’.
