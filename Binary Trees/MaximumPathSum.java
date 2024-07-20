public int maxPathSum(TreeNode root) {
        int pathSum[]=new int[1];
        pathSum[0]=Integer.MIN_VALUE;
        findHeightSum(root,pathSum);
        return pathSum[0];
    }
    private int findHeightSum(TreeNode root,int[] maxi){
        if (root == null) {
            return 0;
        }

        // Calculate the maximum path sum
        // for the left and right subtrees
        int leftMaxPath = Math.max(0, findHeightSum(root.left, maxi));
        int rightMaxPath = Math.max(0, findHeightSum(root.right, maxi));

        // Update the overall maximum
        // path sum including the current node
        maxi[0] = Math.max(maxi[0], leftMaxPath + rightMaxPath + root.val);

        // Return the maximum sum considering
        // only one branch (either left or right)
        // along with the current node
        return Math.max(leftMaxPath, rightMaxPath) + root.val;
    }

Input: root = [1,2,3]
Output: 6
Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.

Input: root = [-10,9,20,null,null,15,7]
Output: 42
Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.
