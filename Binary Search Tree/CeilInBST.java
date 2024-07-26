// Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) {
        if (root == null) return -1;
        int ans=-1;
        while(root!=null){
            if(root.data>=key)
            {
                ans=root.data;
                root=root.left;
            }
            else   root=root.right;
        }
        return ans;
    }

Input:
      5
    /   \
   1     7
    \
     2 
      \
       3
X = 3
Output: 3
Explanation: We find 3 in BST, so ceil
of 3 is 3.

Input:
     10
    /  \
   5    11
  / \ 
 4   7
      \
       8
X = 6
