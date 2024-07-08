public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(new int[9],0,k,n,0,new ArrayList<>(),ans);
        return ans;
    }
    private void helper(int[] temp,int index,int k,int n,int sum,List<Integer> list,List<List<Integer>> ans){
        for(int i=0;i<9;i++){
            temp[i]=i+1;
        }
        if(sum>n){
            return;
        }
        if(index==9){
            if(list.size()==k){
                if(sum==n){
                    ans.add(new ArrayList<>(list));
                    return;
                }
                else return;
            }else return;
        }
        list.add(temp[index]);
        helper(temp,index+1,k,n,sum+temp[index],list,ans);
        list.remove(list.size()-1);
        helper(temp,index+1,k,n,sum,list,ans);
    }

Input: k = 3, n = 7
Output: [[1,2,4]]
Input: k = 3, n = 9
Output: [[1,2,6],[1,3,5],[2,3,4]]
