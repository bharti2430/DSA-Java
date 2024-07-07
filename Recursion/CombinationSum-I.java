public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinations=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Helper(candidates,0,target,list,combinations);
        return combinations;
    }
    private void Helper(int[] arr,int index,int target,List<Integer> list,List<List<Integer>> result){
        if(index==arr.length){
            if(target==0){
                result.add(new ArrayList<>(list));
                return;
            }
            else return;
        }
        if(arr[index]<=target){
            list.add(arr[index]);
            Helper(arr,index,target-arr[index],list,result);
            list.remove(list.size()-1);
        }
        Helper(arr,index+1,target,list,result);
    }

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
