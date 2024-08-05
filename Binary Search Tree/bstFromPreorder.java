public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder,Integer.MAX_VALUE,new int[]{0});
    }
    private TreeNode helper(int[] preorder,int bound,int[] i){
        if(i[0]==preorder.length  || preorder[i[0]]>bound)
            return null;
        TreeNode root=new TreeNode(preorder[i[0]++]);
        root.left=helper(preorder,root.val,i);
        root.right=helper(preorder,bound,i);
        return root;
    }

Input: preorder = [8,5,1,7,10,12]
Output: [8,5,10,1,7,null,12]

Input: preorder = [1,3]
Output: [1,null,3]
