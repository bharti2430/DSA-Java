public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        int data=root.val;
        if(data<p.val && data<q.val)
            return lowestCommonAncestor(root.right,p,q);
        if(data>p.val && data>q.val)
            return lowestCommonAncestor(root.left,p,q);
        return root;
    }

Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
Output: 6
Explanation: The LCA of nodes 2 and 8 is 6.

Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
Output: 2
