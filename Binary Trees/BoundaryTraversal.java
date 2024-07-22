class Solution
{
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList<Integer> result=new ArrayList<>();
	    if(!isLeaf(node)) result.add(node.data);
	    addLeftBoundary(node,result);
	    addLeaves(node,result);
	    addRightBoundary(node,result);
	    return result;
	}
	private boolean isLeaf(Node root){
        if(root==null) return true;
        return root.left==null && root.right==null;
    }
	private void addLeftBoundary(Node root,ArrayList<Integer> res){
	    Node current=root.left;
	    while(current!=null){
	        if(!isLeaf(current)) res.add(current.data);
	        if(current.left!=null) current=current.left;
	        else current=current.right;
	    }
	}
	private void addLeaves(Node root,ArrayList<Integer> res){
	    while(isLeaf(root)){
	        res.add(root.data);
	        return;
	    }
	    if(root.left!=null) addLeaves(root.left,res);
	    if(root.right!=null) addLeaves(root.right,res);
	}
	private void addRightBoundary(Node root,ArrayList<Integer> res){
	    Node current=root.right;
	    Stack<Integer> st=new Stack<>();
	    while(current!=null){
	        if(!isLeaf(current)) st.push(current.data);
	        if(current.right!=null) current=current.right;
	        else current=current.left;
	    }
	    while(!st.isEmpty()){
	        res.add(st.pop());
	    }
	}
}

Input:
        1 
      /   \
     2     3  
    / \   / \ 
   4   5 6   7
      / \
     8   9
   
Output: 1 2 4 8 9 6 7 3

Input:
            1
           /
          2
        /  \
       4    9
     /  \    \
    6    5    3
             /  \
            7     8

Output: 1 2 4 6 5 7 8
