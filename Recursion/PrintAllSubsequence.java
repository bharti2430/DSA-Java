public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        subsetsHelper(nums,0,current,list);
        return list;
    }
    private void subsetsHelper(int[] nums,int index,List<Integer> current,List<List<Integer>> list){
        if(index==nums.length){
            list.add(new ArrayList<>(current));
            return;
        }
        // Include the current element
        current.add(nums[index]);
        subsetsHelper(nums,index+1,current,list);
        // Exclude the current element(backtrack)
        current.remove(current.size()-1);
        subsetsHelper(nums,index+1,current,list);
    }

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Input: nums = [0]
Output: [[],[0]]
