//Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int size){
        helper(s,0,size);
    } 
    public void helper(Stack<Integer> st,int count,int size){
        if(count==(size/2)){
            st.pop();
            return;
        }
        int num=st.pop();
        helper(st,count+1,size);
        st.push(num);
    }
