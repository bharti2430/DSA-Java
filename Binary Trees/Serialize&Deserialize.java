// Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "";
        Queue<TreeNode> q=new LinkedList<>();
        StringBuilder res=new StringBuilder();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode parent=q.poll();
            if(parent==null){
                res.append("n ");
            }
            else {
                res.append(parent.val+" ");
                q.offer(parent.left);
                q.offer(parent.right);
            }
        }
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("")) return null;
        String[] values=data.split(" ");
        TreeNode root=new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int i=1;
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(i<values.length && !values[i].equals("n")){
                TreeNode leftNode=new TreeNode(Integer.parseInt(values[i]));
                node.left=leftNode;
                q.offer(leftNode);
            }
            i++;
            if(i<values.length && !values[i].equals("n")){
                TreeNode rightNode=new TreeNode(Integer.parseInt(values[i]));
                node.right=rightNode;
                q.offer(rightNode);
            }
            i++;
        }
        return root;
    }

Input: root = [1,2,3,null,null,4,5]
Output: [1,2,3,null,null,4,5]

Input: root = []
Output: []
