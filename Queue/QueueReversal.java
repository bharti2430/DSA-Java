//Function to reverse the queue.
// using stack
    public Queue<Integer> rev(Queue<Integer> q){
        Stack<Integer> st=new Stack<>();
        while(!q.isEmpty()){
            int el=q.poll();
            st.push(el);
        }
        while(!st.isEmpty()){
            int el=st.pop();
            q.offer(el);
        }
        return q;
    }

Input:
6
4 3 1 10 2 6
Output: 
6 2 10 1 3 4

// using recursion
if (q.isEmpty()) {
    return q;
}
int el = q.peek();
q.remove();
rev(q);
q.add(el);
return q;
