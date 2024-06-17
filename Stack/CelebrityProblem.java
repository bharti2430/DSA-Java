//Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	Stack<Integer> st=new Stack<>();
    	for(int i=0;i<n;i++){
    	    st.push(i);
    	}
    	while(st.size()!=1){
    	    int a=st.peek();
    	    st.pop();
    	    int b=st.peek();
    	    st.pop();
    	    if(M[a][b]==1){
    	        st.push(b);
    	    }else{
    	        st.push(a);
    	    }
    	}
    	if (st.isEmpty()) {
            return -1;
        }
    	int candidate=st.pop();
    	for(int i=0;i<n;i++){
    	    // A celebrity should not know anyone else
    	    if (i != candidate && M[candidate][i] == 1) {
                return -1;
            }
            // Everyone should know the celebrity
            if (i != candidate && M[i][candidate] == 0) {
                return -1;
            }
    	}
    	return candidate;
    }

Input:
N = 3
M[][] = {{0 1 0},
         {0 0 0}, 
         {0 1 0}}
Output: 1
Explanation: 0th and 2nd person both
know 1. Therefore, 1 is the celebrity. 

Input:
N = 2
M[][] = {{0 1},
         {1 0}}
Output: -1
Explanation: The two people at the party both
know each other. None of them is a celebrity.
