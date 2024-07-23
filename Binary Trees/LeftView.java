//Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      ArrayList<Integer> res=new ArrayList<>();
      helper(root,0,res);
      return res;
    }
    private void helper(Node root,int level,ArrayList<Integer> res){
        if(root==null){
            return;
        }
        if(level==res.size())
            res.add(root.data);
        helper(root.left,level+1,res);
        helper(root.right,level+1,res);
    }

Input:
   1
 /  \
3    2
Output: 1 3

Input:
   10
  /  \
20   30
/ \
40 60
Output: 10 20 40
