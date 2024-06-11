public Stack<Integer> sort(Stack<Integer> st) {
        if(st.isEmpty()){
            return st;
        }
        int topEl=st.peek();
        st.pop();
        //recursive call
        sort(st);
        sortInsert(st,topEl);
        return st;
    }
    private void sortInsert(Stack<Integer> st,int num){
        if(st.isEmpty() ||(!st.isEmpty() && st.peek()<num)){
            st.push(num);
            return;
        }
        int top=st.pop();
        //recursive call
        sortInsert(st,num);
        st.push(top);
    }
