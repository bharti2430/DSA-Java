count=lasOccurence-firstOccurence+1
//brute with linear search
int count(int[] arr, int n, int x) {
        int first=-1,last=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x)
            {
                if(first==-1) first=i;
                last=i;
            }
        }
        if(first==-1) return 0;
        return (last-first+1);
    }

Input:
N = 7, X = 2
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 4
Input:
N = 7, X = 4
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 0

//optimal with binary search if we will use function of firstOccurence and last Occurence
