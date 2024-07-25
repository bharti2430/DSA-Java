static boolean isBSTTraversal(int arr[]) {
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>=arr[i])
                return false;
        }
        return true;
    }

Input: arr[] = [8, 14, 45, 64, 100]
Output: True
Input: arr[] = [5, 6, 1, 8, 7]
Output: False
