public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int result[]=new int[n-k+1];
        int index=0;
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            //remove numbers out of range k
            if(!q.isEmpty() && q.peek()==i-k){
                q.poll();
            }
            //remove smaller numbers in k range as they are useless
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1){
                result[index++]=nums[q.peek()];
            }
        }
        return result;
    }

Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
