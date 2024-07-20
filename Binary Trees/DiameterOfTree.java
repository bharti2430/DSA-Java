public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter=new int[1];
        diameter[0]=0;
        findHeight(root,diameter);
        return diameter[0];
    }
    private int findHeight(TreeNode root,int[] diameter){
        if(root==null){
            return 0;
        }
        int l[]=new int[1];
        int r[]=new int[1];
        l[0]=findHeight(root.left,diameter);
        r[0]=findHeight(root.right,diameter);
        diameter[0]=Math.max(diameter[0],(l[0]+r[0]));
        return 1+Math.max(l[0],r[0]);
    }

Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].

Input: root = [1,2]
Output: 1
