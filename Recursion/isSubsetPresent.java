public static boolean isSubsetPresent(int n, int k, int[] a) {
    return helper(a, 0, 0, k);
}

private static boolean helper(int[] arr, int index, int sum, int k) {
    // Base case: if the current sum is equal to k
    if (sum == k) {
        return true;
    }
    
    // Base case: if we have reached the end of the array
    if (index == arr.length) {
        return false;
    }
    
    // Recursive case: try including the current element in the sum
    if (helper(arr, index + 1, sum + arr[index], k)) {
        return true;
    }
    
    // Recursive case: try excluding the current element from the sum
    if (helper(arr, index + 1, sum, k)) {
        return true;
    }
    
    return false;
}

Sample Input 1 :
4 13
4 3 5 2
Sample Output 1 :
No
Sample Input 2 :
5 14
4 2 5 6 7
Sample Output 2 :
Yes
