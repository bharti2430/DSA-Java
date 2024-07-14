public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        helper(root,result);
        return result;
    }
    private void helper(TreeNode root,List<Integer> res){
        if(root==null)
            return;
        helper(root.left,res);
        helper(root.right,res);
        res.add(root.val);
    }

Input: root = [1,null,2,3]
Output: [3,2,1]

Input: root = []
Output: []
