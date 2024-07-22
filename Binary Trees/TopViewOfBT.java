// Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> res=new ArrayList<>();
        if(root==null) return res;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Pair it=q.poll();
            int line=it.state;
            Node node=it.node;
            if(map.get(line)==null) map.put(line,node.data);
            if(node.left!=null){
                q.add(new Pair(line-1,node.left));
            }
            if(node.right!=null){
                q.add(new Pair(line+1,node.right));
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }

nput:
      1
   /    \
  2      3
Output: 2 1 3

Input:
       10
    /      \
  20        30
 /   \    /    \
40   60  90    100
Output: 40 20 10 30 100
