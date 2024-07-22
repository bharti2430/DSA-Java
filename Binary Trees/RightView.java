// using level order traversal
public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                temp.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            result.add(temp.get(temp.size()-1));
        }
        return result;
    }

// recursive(preorder) root->right->left
public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        helper(root,0,result);
        return result;
    }
    private void helper(TreeNode node,int level,List<Integer> result){
        if(node==null) return;
        if(level==result.size()) result.add(node.val);
        helper(node.right,level+1,result);
        helper(node.left,level+1,result);
    }

Input: root = [1,2,3,null,5,null,4]
Output: [1,3,4]

Input: root = [1,null,3]
Output: [1,3]
