public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        helper(nums,0,new ArrayList<>(),result);
        return result;
    }
    private void helper(int[] arr,int index,List<Integer> list,List<List<Integer>> result){
        result.add(new ArrayList<>(list));
        for(int i=index;i<arr.length;i++){
            if(i!=index && arr[i]==arr[i-1]) continue;
            list.add(arr[i]);
            helper(arr,i+1,list,result);
            list.remove(list.size()-1);
        }
    }

The solution set must not contain duplicate subsets. Return the solution in any order.

Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]

Input: nums = [0]
Output: [[],[0]]
