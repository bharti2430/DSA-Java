public static void changeTree(BinaryTreeNode < Integer > root) {
        int child=0;
        if(root.left!=null)
            child+=root.left.data;
        if(root.right!=null)
            child+=root.right.data;
        if(child>=root.data) 
            root.data=child;
        else{
            if(root.left!=null) root.left.data=root.data;
            if(root.right!=null) root.right.data=root.data;
        }
        if (root.left != null) changeTree(root.left);
        if (root.right != null) changeTree(root.right);

        int total=0;
        if(root.left!=null) 
            total+=root.left.data;
        if(root.right!=null) 
            total+=root.right.data;
        if((root.left!=null) || (root.right!=null))
            root.data=total;
    }
