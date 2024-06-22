// Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<k;i++){
            int val=q.peek();
            q.poll();
            st.push(val);
        }
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
        for(int i=0;i<(q.size()-k);i++){
            q.add(q.remove());
        }
        return q;
    }

Input:
5 3
1 2 3 4 5
Output: 
3 2 1 4 5
