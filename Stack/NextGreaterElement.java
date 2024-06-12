
//SIMPLE ONCE
//Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        long[] result=new long[n];
        Stack<Long> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                result[i]=-1;
            }
            else{
                result[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return result;
    }

N = 4, arr[] = [1 3 2 4]
Output:
3 4 4 -1

Input: 
N = 5, arr[] [6 8 0 1 3]
Output:
8 -1 1 3 -1

//CIRCULAR
public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int result[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=-1;
        }
        for(int i=2*(nums.length-1);i>=0;i--)
        {
            int num=nums[i%(nums.length)];
            while(!st.isEmpty() && st.peek()<=num)
            {
                st.pop();
            }
            if(i<nums.length){
                if(!st.isEmpty()){
                    result[i]=st.peek();
                }
            }
            st.push(num);
        }
        return result;
    }

Input: nums = [1,2,1]
Output: [2,-1,2]

Input: nums = [1,2,3,4,3]
Output: [2,3,4,-1,4]
