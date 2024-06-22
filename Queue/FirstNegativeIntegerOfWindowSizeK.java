public static int[] firstNegative(int[] arr, int n, int k) {
        Queue<Integer> q=new LinkedList<>();
		// Process the first window of size k
		for(int i=0;i<k;i++){
			if(arr[i]<0)
				q.offer(arr[i]);
		}
		int[] result=new int[n-k+1];
		result[0]=q.isEmpty()?0:q.peek();
		for(int i=1;i<(n-k+1);i++){
			if(arr[i-1]<0){
				q.poll();
			}
			if(arr[i+k-1]<0){
				q.offer(arr[i+k-1]);
			}
			result[i]=q.isEmpty()?0:q.peek();
		}
		return result;
	}

For the given array 'ARR' = [5, -3, 2, 3, -4] and 'K' = 2.
Output = -3 -3 0 -4
