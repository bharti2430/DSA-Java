public int widthOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        int maxi=0;
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            int size=q.size();
            int min=q.peek().index;
            int first=0,last=0;
            for(int i=0;i<size;i++){
                int currentIndex=q.peek().index-min;
                TreeNode node=q.peek().node;
                q.poll();
                if(i==0) first=currentIndex;
                if(i==size-1) last=currentIndex;
                if(node.left!=null) q.offer(new Pair(node.left,currentIndex*2+1));
                if(node.right!=null) q.offer(new Pair(node.right,currentIndex*2+2));
            }
            maxi=Math.max(maxi,last-first+1);
        }
        return maxi;
    }

Input: root = [1,3,2,5,3,null,9]
Output: 4
Explanation: The maximum width exists in the third level with length 4 (5,3,null,9).

Input: root = [1,3,2,5,null,null,9,6,null,7]
Output: 7
Explanation: The maximum width exists in the fourth level with length 7 (6,null,null,null,null,null,7).
  
Input: root = [1,3,2,5]
Output: 2
Explanation: The maximum width exists in the second level with length 2 (3,2).
