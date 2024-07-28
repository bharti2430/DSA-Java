public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null) return result;
        TreeNode current=root;
        while(current!=null){
            if(current.left==null){
                result.add(current.val);
                current=current.right;
            }
            else{
                TreeNode prev=current.left;
                while(prev.right!=null && prev.right!=current){
                    prev=prev.right;
                }
                if(prev.right==null){
                    prev.right=current;
                    current=current.left;
                }else{
                    prev.right=null;
                    result.add(current.val);
                    current=current.right;
                }
            }
        }
        return result;
    }
