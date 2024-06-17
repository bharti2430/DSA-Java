Pair getFloorAndCeil(int[] arr, int n, int x) {
        int floor=getFloor(arr,n,x);
        int ceil=getCeil(arr,n,x);
        Pair p=new Pair(floor,ceil);
        return p;
    }
    private int getFloor(int[] arr,int n,int x){
        int low = 0, high = n - 1;
        int floor = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= x) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1; 
            }
        }
        return floor;
    }
    private int getCeil(int[] arr,int n,int x){
        int low = 0, high = n - 1;
        int ceil = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ceil = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1; 
            }
        }
        return ceil;
    }

Input:
N = 8, X = 7
Arr[] = {5, 6, 8, 9, 6, 5, 5, 6}
Output: 6 8
