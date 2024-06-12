// Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n) {
        int result[]=new int[n];
        result=calculatePrevHigh(price,n);
        for(int i=0;i<n;i++){
            result[i]=i-result[i];
        }
        return result;
    }
    private static int[] calculatePrevHigh(int price[],int n){
        Stack<Integer> st=new Stack<>();
        int result[]=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && price[st.peek()]<=price[i]){
                st.pop();
            }
            if(st.isEmpty()){
                result[i]=-1;
            }
            else{
                result[i]=st.peek();
            }
            st.push(i);
        }
        return result;
    }

N = 7, price[] = [100 80 60 70 60 75 85]
Output:
1 1 1 2 1 4 6
