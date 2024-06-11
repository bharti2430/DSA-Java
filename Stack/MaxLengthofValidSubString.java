static int findMaxLen(String S) {
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int result=0;
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(ch=='('){
                st.push(i);
            }
            else{
                if(!st.isEmpty()){
                     st.pop();
                     if(!st.isEmpty()){
                         result=Math.max(result,i-st.peek());
                     }
                     else st.push(i);
                }
            }
        }
        return result;
    }

Input: s = "(()("
Output: 2
Explanation: The longest valid 
substring is "()". Length = 2.

Input: s = "()(())("
Output: 6
Explanation: The longest valid 
substring is "()(())". Length = 6.
