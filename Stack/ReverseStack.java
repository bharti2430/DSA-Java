static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty()) return;
        int top=s.pop();
        reverse(s);
        pushAtBottom(s,top);
    }
    private static void pushAtBottom(Stack<Integer> st,int data){
        if(st.isEmpty()) {
            st.push(data);
            return;
        }
        int top=st.pop();
        pushAtBottom(st,data);
        st.push(top);
    }

Input:
St = {3,2,1,7,6}
Output:
{6,7,1,2,3}
