class NodeValue{
    int maxNode,minNode,maxSize;
    NodeValue(int maxNode,int minNode,int maxSize){
        this.maxNode=maxNode;
        this.minNode=minNode;
        this.maxSize=maxSize;
    }
 }

class Solution{
    
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
        return helper(root).maxSize;
    }
    private static NodeValue helper(Node root){
        if(root==null)
            return new NodeValue(Integer.MIN_VALUE,Integer.MAX_VALUE,0);
        NodeValue l=helper(root.left);
        NodeValue r=helper(root.right);
        if(root.data>l.maxNode && root.data<r.minNode){
            return new NodeValue(Math.max(r.maxNode,root.data),Math.min(root.data,l.minNode),1+l.maxSize+r.maxSize);
        }
        return new NodeValue(Integer.MAX_VALUE,Integer.MIN_VALUE,Math.max(l.maxSize,r.maxSize));
    }
}
