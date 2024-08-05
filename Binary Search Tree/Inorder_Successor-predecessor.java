public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
        // update pre[0] with the predecessor of the key
        // update suc[0] with the successor of the key
        if(root==null) return;
        // If the key is found
        if (root.data == key) 
        {
            // The maximum value in the left subtree is the predecessor
            if (root.left != null) 
            {
                Node temp = root.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                pre[0] = temp;
            }
            // The minimum value in the right subtree is the successor
            if (root.right != null) 
            {
                Node temp = root.right;
                while (temp.left != null) {
                    temp = temp.left;
                }
                suc[0] = temp;
            }
            return;
        }
        // If the key is smaller than root's key, go to the left subtree
        if (key < root.data) {
            suc[0] = root;
            findPreSuc(root.left, pre, suc, key);
        } else { // If the key is greater than root's key, go to the right subtree
            pre[0] = root;
            findPreSuc(root.right, pre, suc, key);
        }
    }

Input:
      8
    /   \
   1     9
    \     \
     4    10
    /
   3
key = 8 
Output: 4 9
Explanation: 
In the given BST the inorder predecessor of 8 is 4 and inorder successor of 8 is 9.

Input:
        10
      /   \
     2    11
   /  \ 
  1    5
      /  \
     3    6
      \
       4
key = 11
Output: 10 -1
Explanation:In given BST, the inorder predecessor of 11 is 10 whereas it does not have any inorder successor.
