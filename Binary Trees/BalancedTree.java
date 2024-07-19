public boolean isBalanced(TreeNode root) {
        return findHeight(root)!=-1;
    }
    private int findHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=findHeight(root.left);
        int r=findHeight(root.right);
        if(l==-1 || r==-1) return -1;
        if(Math.abs(l-r)>1) return -1;
        return 1+Math.max(l,r);
    }

Input: root = [3,9,20,null,null,15,7]
Output: true

Input: root = [1,2,2,3,3,null,null,4,4]
Output: false
