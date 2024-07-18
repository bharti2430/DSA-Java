public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        return 1+ Math.max(l,r);
    }

Input: root = [3,9,20,null,null,15,7]
Output: 3

Input: root = [1,null,2]
Output: 2
