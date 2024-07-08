ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> result=new ArrayList<>();
        helper(arr,0,0,result);
        Collections.sort(result);
        return result;
    }
    private void helper(ArrayList<Integer> arr,int index,int sum,ArrayList<Integer> result){
        if(index==arr.size()){
            result.add(sum);
            return;
        }
        helper(arr,index+1,sum+arr.get(index),result);
        helper(arr,index+1,sum,result);
    }

Input:
n = 2
arr[] = {2, 3}
Output:
0 2 3 5
