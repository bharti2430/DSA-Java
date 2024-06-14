public int largestRectangleArea(int[] heights) {
        int width[]=findWidth(heights);
        int area[]=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            area[i]=heights[i]*width[i];
        }
        int maxArea=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            if(area[i]>maxArea){
                maxArea=area[i];
            }
        }
        return maxArea;
    }
    private static int[] NSR(int arr[]){
        Stack<Integer> st=new Stack<>();
        int[] right=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                right[i]=arr.length;
            }
            else{
                right[i]=st.peek();
            }
            st.push(i);
        }
        return right;
    }
    private static int[] NSL(int arr[]){
        Stack<Integer> st=new Stack<>();
        int[] left=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i]=-1;
            }
            else{
                left[i]=st.peek();
            }
            st.push(i);
        }
        return left;
    }
    private static int[] findWidth(int arr[]){
        int[] right=NSR(arr);
        int[] left=NSL(arr);
        int[] width=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            width[i]=right[i]-left[i]-1;
        }
        return width;
    }

Input: heights = [2,1,5,6,2,3]
Output: 10
