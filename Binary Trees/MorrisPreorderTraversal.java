public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null) return res;
        TreeNode current=root;
        while(current!=null){
            if(current.left==null)
            {
                res.add(current.val);
                current=current.right;
            }else{
                TreeNode prev=current.left;
                while(prev.right!=null && prev.right!=current){
                    prev=prev.right;
                }
                if(prev.right==null){
                    res.add(current.val);
                    prev.right=current;
                    current=current.left;
                }else{
                    prev.right = null;
                    current = current.right;
                }
            }
        }
        return res;
    }
