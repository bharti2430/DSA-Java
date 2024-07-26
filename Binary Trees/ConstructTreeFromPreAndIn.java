public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> inMap=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            inMap.put(inorder[i],i);
        TreeNode root=buildTree(preorder,0,preorder.length-1,0,inorder.length-1,inMap);
        return root;
    }
    private TreeNode buildTree(int[] preorder,int preStart,int preEnd,int inStart,int inEnd,HashMap<Integer,Integer> inMap){
        if(preStart>preEnd || inStart>inEnd)
            return null;
        TreeNode root=new TreeNode(preorder[preStart]);
        int rootIndex=inMap.get(root.val);
        int numsLeft=rootIndex-inStart; // Left subtree
        root.left=buildTree(preorder,preStart+1,preStart+numsLeft,inStart,rootIndex-1,inMap);
        root.right=buildTree(preorder,preStart+numsLeft+1,preEnd,rootIndex+1,inEnd,inMap);
        return root;
    }

Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]

Input: preorder = [-1], inorder = [-1]
Output: [-1]
