
static List<Integer> leftSmaller(int n, int a[])
    {
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()>=a[i]){
                st.pop();
            }
            if(st.isEmpty()){
                result.add(-1);
            }
            else{
                result.add(st.peek());
            }
            st.push(a[i]);
        }
        return result;
    }

Input: n = 3
a = {1, 6, 2}
Output: -1 1 1
