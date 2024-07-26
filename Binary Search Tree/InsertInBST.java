public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode current=root;
        TreeNode newnode=new TreeNode(val);
        if(root==null)
            return newnode;
        while(true){
            if (val < current.val) 
            {
                // Go to the left subtree
                if (current.left == null) {
                    current.left = newnode;
                    break;
                }
                current = current.left;
            }
            else 
            {
                // Go to the right subtree
                if (current.right == null) {
                    current.right = newnode;
                    break;
                }
                current = current.right;
            }
        }
        return root;
    }

Input: root = [40,20,60,10,30,50,70], val = 25
Output: [40,20,60,10,30,50,70,null,null,25]

Input: root = [4,2,7,1,3,null,null,null,null,null,null], val = 5
Output: [4,2,7,1,3,5]
