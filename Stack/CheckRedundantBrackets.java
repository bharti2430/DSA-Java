public static int checkRedundancy(String s) {
        Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    if(ch=='(' || ch=='+' || ch=='-' || ch=='*' || ch=='/')
		        st.push(ch);
		    else
		    {
		        int redundant=1;
		        if(ch==')'){
		            while(st.peek()!='('){
		                char top=st.peek();
		                if(top=='+' || top=='-' || top=='*' || top=='/')
		                {
		                    redundant=0;
		                }
		                st.pop();
		            }
		            if(redundant==1)
		                return 1;
		            st.pop();
		        }
		    }
		}
		return 0;
    }

Input:
exp = ((a+b))
Output:
Yes
Explanation:
((a+b)) can reduced to (a+b).

Input:
exp = (a+b+(c+d))
Output:
No
