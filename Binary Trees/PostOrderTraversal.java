public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        helper(root,result);
        return result;
    }
    private void helper(TreeNode root,List<Integer> res){
        if(root==null)
            return;
        helper(root.left,res);
        helper(root.right,res);
        res.add(root.val);
    }

Input: root = [1,null,2,3]
Output: [3,2,1]

Input: root = []
Output: []

// Iterative approach
public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Stack<TreeNode> st1=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();
        st1.push(root);
        while(!st1.isEmpty()){
            TreeNode node=st1.pop();
            st2.push(node);
            if(node.left!=null){
                st1.push(node.left);
            }
            if(node.right!=null){
                st1.push(node.right);
            }
        }
        while(!st2.isEmpty()){
            TreeNode node=st2.pop();
            result.add(node.val);
        }
        return result;
    }


// Using 1 stack
public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Stack<TreeNode> st=new Stack<>();
        TreeNode current=root;
        while(current!=null || !st.isEmpty()){
            if(current!=null){
                st.push(current);
                current=current.left;
            }
            else{
                TreeNode temp=st.peek().right;
                if(temp==null){
                    temp=st.pop();
                    result.add(temp.val);
                    while(!st.isEmpty() && temp==st.peek().right){
                        temp=st.pop();
                        result.add(temp.val);
                    }
                }
                else{
                    current=temp;
                }
            }
        }
        return result;
    }
