//Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        // Base case: If the node is null or a leaf node, return true (1)
        if (root == null || (root.left == null && root.right == null)) 
            return 1;
    
        int leftData = (root.left != null) ? root.left.data : 0;
        int rightData = (root.right != null) ? root.right.data : 0;
    
        // Check if the current node's value is equal to the sum of its children
        if (root.data == leftData + rightData) {
            // Recursively check the left and right subtrees
            if (isSumProperty(root.left) == 1 && isSumProperty(root.right) == 1) {
                return 1;
            }
        }
    
        // If the current node does not satisfy the sum property, return false (0)
        return 0;
    }

Input:
Binary tree
       35
      /   \
     20  15
    /  \  /  \
   15   5 10  5
Output: 
1

Input:
Binary tree
       1
     /   \
    4    3
   /  
  5    
Output: 
0
