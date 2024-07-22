//Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList <Integer> res=new ArrayList <Integer>();
        if(root==null) return res;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Node> q=new LinkedList<>();
        root.hd=0;
        q.add(root);
        while(!q.isEmpty()){
            Node node=q.poll();
            int hd=node.hd;
            map.put(hd,node.data);
            if(node.left!=null){
                node.left.hd=hd-1;
                q.add(node.left);
            }
            if(node.right!=null){
                node.right.hd=hd+1;
                q.add(node.right);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }

Input:
       1
     /   \
    3     2
Output: 3 1 2

Input:
         10
       /    \
      20    30
     /  \
    40   60
Output: 40 20 60 30
