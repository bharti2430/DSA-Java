public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        if(root==null) return result;
        helper(root,new ArrayList<>(),result);
        return result;
    }
    private static void helper(Node root,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> result){
        list.add(root.data);
        if(root.left==null && root.right==null){
            result.add(new ArrayList<>(list));
        } else{
            if(root.left!=null)
                helper(root.left,list,result);
            if(root.right!=null)
                helper(root.right,list,result);
        }
        list.remove(list.size()-1);
    }

Input:
       1
    /     \
   2       3
Output: 
1 2 
1 3 

Input:
         10
       /    \
      20    30
     /  \
    40   60
Output: 
10 20 40 
10 20 60 
10 30 
