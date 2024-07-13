public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        helper(root,res);
        return res;
    }
    private void helper(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        res.add(node.val);          // Visit the root
        helper(node.left, res);     // Traverse the left subtree
        helper(node.right, res);    // Traverse the right subtree
    }

Input: root = [1,null,2,3]
Output: [1,2,3]

Input: root = []
Output: []
