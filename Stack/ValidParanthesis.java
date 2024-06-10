//Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);
            if(ch=='[' || ch=='(' || ch=='{'){
                st.push(ch);
            }
            else
            {
                if(st.isEmpty()) return false;
                char topEl=st.peek();
                if((ch == ']' && topEl == '[') ||
                (ch == ')' && topEl == '(') ||
                (ch == '}' && topEl == '{')) 
                    st.pop();
                else return false;
            }
        }
       return st.isEmpty();
    }

Input:
{([])}
Output: 
true
