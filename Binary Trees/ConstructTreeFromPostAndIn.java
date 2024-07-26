public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length!=postorder.length)
            return null;
        HashMap<Integer,Integer> inMap=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            inMap.put(inorder[i],i);
        TreeNode root=buildTree(postorder,0,postorder.length-1,0,inorder.length-1,inMap);
        return root;
    }
    private TreeNode buildTree(int[] postorder,int postStart,int postEnd,int inStart,int inEnd,HashMap<Integer,Integer> inMap){
        if(postStart>postEnd || inStart>inEnd)
            return null;
        TreeNode root=new TreeNode(postorder[postEnd]);
        int inRoot=inMap.get(root.val);
        int numsLeft=inRoot-inStart;
        root.left=buildTree(postorder,postStart,postStart+numsLeft-1,inStart,inRoot-1,inMap);
        root.right=buildTree(postorder,postStart+numsLeft,postEnd-1,inRoot+1,inEnd,inMap);
        return root;
    }

Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
Output: [3,9,20,null,null,15,7]

Input: inorder = [-1], postorder = [-1]
Output: [-1]
 
