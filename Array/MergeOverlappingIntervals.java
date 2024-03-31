public static List< List< Integer > > mergeOverlappingIntervals(int [][]arr){
        List<List<Integer>> ans=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr, (a, b) -> (a[0] - b[0]));
        int start = arr[0][0];
        int end = arr[0][1];

        for (int i = 1; i < n; i++) {
            if (arr[i][0] <= end) {
                end = Math.max(end, arr[i][1]);
            } else {
                ans.add(Arrays.asList(start, end));
                start = arr[i][0];
                end = arr[i][1];
            }
        }
        ans.add(Arrays.asList(start, end));

        return ans;
    }
