public TreeNode searchBST(TreeNode root, int val) {
        if(root==null || root.val==val) return root;
        if(root.val<val){
            return searchBST(root.right,val);
        }
        else{
            return searchBST(root.left,val);
        }
    }

Input: root = [4,2,7,1,3], val = 2
Output: [2,1,3]
Input: root = [4,2,7,1,3], val = 5
Output: []
