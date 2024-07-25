public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int left=getLeftHeight(root);
        int right=getRightHeight(root);
        if(left==right) return (2<<left)-1;
        else return countNodes(root.left)+countNodes(root.right)+1;
    }
    private int getLeftHeight(TreeNode root){
        int count=0;
        while(root.left!=null){
            count++;
            root=root.left;
        }
        return count;
    }
    private int getRightHeight(TreeNode root){
        int count=0;
        while(root.right!=null){
            count++;
            root=root.right;
        }
        return count;
    }

Input: root = [1,2,3,4,5,6]
Output: 6

Input: root = []
Output: 0

Input: root = [1]
Output: 1
