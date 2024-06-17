public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
      int ngeCount[]=new int[N];
      int[] result=new int[queries];
      for(int i=0;i<N;i++){
          int count=0;
          for(int j=i+1;j<N;j++){
              if(arr[j]>arr[i]){
                  count++;
              }
          }
          ngeCount[i]=count;
      }
        for (int i = 0; i < queries; i++) {
            result[i] = ngeCount[indices[i]];
        }
        return result;
  }

Input:  arr     = [3, 4, 2, 7, 5, 8, 10, 6]
        queries = 2
        indices = [0, 5]
Output:  6, 1
