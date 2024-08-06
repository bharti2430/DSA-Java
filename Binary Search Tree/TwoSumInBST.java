public boolean findTarget(TreeNode root, int k) {
        if(root==null) return false;
        List<Integer> inorder=new ArrayList<>();
        findInorder(root,inorder);
        int i=0,j=inorder.size()-1;
        while(i<j){
            int sum=inorder.get(i)+inorder.get(j);
            if(sum==k) return true;
            else if(sum>k){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
    private void findInorder(TreeNode node,List<Integer> inorder){
        if(node==null) return; 
        if(node.left!=null) findInorder(node.left,inorder);
        inorder.add(node.val);
        if(node.right!=null) findInorder(node.right,inorder);
    }

Input: root = [5,3,6,2,4,null,7], k = 9
Output: true

Input: root = [5,3,6,2,4,null,7], k = 28
Output: false

//Optimal
class BSTIterator {
    private Stack<TreeNode> st=new Stack<>();
    boolean reverse= true;
    public BSTIterator(TreeNode root,boolean isReverse) {
        reverse=isReverse;
        pushAll(root);
    }
    
    public int next() {
        TreeNode node=st.pop();
        if(reverse==true) pushAll(node.right);
        else pushAll(node.left);
        return node.val;
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
    }
    private void pushAll(TreeNode node){
        if(node==null) return;
        while(node!=null){
            st.push(node);
            if(reverse==true) node=node.left;
            else node=node.right;
        }
    }
}
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if(root==null) return false;
        BSTIterator l=new BSTIterator(root,true);
        BSTIterator r=new BSTIterator(root,false);
        int i=l.next(),j=r.next();
        while(i<j){
            int sum=i+j;
            if(sum==k) return true;
            else if(sum>k){
                j=r.next();
            }else{
                i=l.next();
            }
        }
        return false;
    }
}
