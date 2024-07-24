public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        return helper(root,0,targetSum);
    }
    private boolean helper(TreeNode root,int sum,int targetSum){
        sum+=root.val;
        if(root.left==null && root.right==null){
            return sum==targetSum;
        }
            boolean leftPath = false;
        boolean rightPath = false;

        if (root.left != null) {
            leftPath = helper(root.left, sum, targetSum);  // Recursively check left subtree
        }

        if (root.right != null) {
            rightPath = helper(root.right, sum, targetSum);  // Recursively check right subtree
        }

        return leftPath || rightPath;  // Return true if either left or right subtree has a valid path
    }

Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true
Explanation: The root-to-leaf path with the target sum is shown.

Input: root = [1,2,3], targetSum = 5
Output: false
Explanation: There two root-to-leaf paths in the tree:
(1 --> 2): The sum is 3.
(1 --> 3): The sum is 4.
There is no root-to-leaf path with sum = 5.
