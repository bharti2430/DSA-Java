public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        helper(root,result);
        return result;
    }
    private void helper(TreeNode root,List<Integer> res){
        if(root==null)
            return;
        helper(root.left,res);
        res.add(root.val);
        helper(root.right,res);
    }

Input: root = [1,null,2,3]
Output: [1,3,2]

Input: root = []
Output: []

// Iterative approach
public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null) return result;
        Stack<TreeNode> st=new Stack<>();
        TreeNode node=root;
        while(true){
            if(node!=null){
                st.push(node);
                node=node.left;
            } else{
                if(st.isEmpty())
                    break;
                node=st.pop();
                result.add(node.val);
                node = node.right;
            }
        }
        return result;
    }
