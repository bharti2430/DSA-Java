public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
        int cnt[]=new int[1];
        int ans[]=new int[1];
        inorder(root,k,cnt,ans);
        return ans[0];
    }
    private void inorder(TreeNode root,int k,int[] cnt,int[] ans){
        if(root==null || cnt[0]>=k) return;
        inorder(root.left,k,cnt,ans);
        cnt[0]++;
        if(cnt[0]==k){
            ans[0]=root.val;
        }
        inorder(root.right,k,cnt,ans);
    }

Input: root = [3,1,4,null,2], k = 1
Output: 1

Input: root = [5,3,6,2,4,null,null,1], k = 3
Output: 3
