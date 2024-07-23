public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return isSymmetricHelper(root.left,root.right);
    }
    private boolean isSymmetricHelper(TreeNode node1,TreeNode node2){
        if(node1==null && node2==null)
            return true;
        if(node1==null || node2==null)
            return false;
        return (node1.val==node2.val)
            && isSymmetricHelper(node1.left,node2.right)
            && isSymmetricHelper(node1.right,node2.left);
    }

Input: root = [1,2,2,3,4,4,3]
Output: true

Input: root = [1,2,2,null,3,null,3]
Output: false
