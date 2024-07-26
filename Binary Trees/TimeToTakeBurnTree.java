public static int minTime(Node root, int target) 
    {
        HashMap<Node,Node> parents=new HashMap<>();
        Node targetNode=markParents(root,parents,target);
        int mini=getMinTime(parents,targetNode);
        return mini;
    }
    private static Node markParents(Node root,HashMap<Node,Node> parents,int target){
        Queue<Node> q=new LinkedList<>();
        Node res=new Node(-1);
        q.offer(root);
        while(!q.isEmpty()){
            Node node=q.poll();
            if(node.data==target)
                res=node;
            if(node.left!=null){
                parents.put(node.left,node);
                q.offer(node.left);
            }
            if(node.right!=null){
                parents.put(node.right,node);
                q.offer(node.right);
            }
        }
        return res;
    }
    private static int getMinTime(HashMap<Node,Node> parents,Node target){
        Queue<Node> q=new LinkedList<>();
        HashSet<Node> visited=new HashSet<>();
        q.offer(target);
        visited.add(target);
        int time=0;
        while(!q.isEmpty()){
            int size=q.size();
            int flag=0;
            for(int i=0;i<size;i++){
                Node node=q.poll();
                if(node.left!=null && !visited.contains(node.left)){
                    flag=1;
                    q.offer(node.left);
                    visited.add(node.left);
                }
                if(node.right!=null && !visited.contains(node.right)){
                    flag=1;
                    q.offer(node.right);
                    visited.add(node.right);
                }
                if(parents.get(node)!=null && !visited.contains(parents.get(node))){
                    flag=1;
                    q.offer(parents.get(node));
                    visited.add(parents.get(node));
                }
            }
            if(flag==1) time++;
        }
        return time;
    }

Input:      
          1
        /   \
      2      3
    /  \      \
   4    5      6
       / \      \
      7   8      9
                   \
                   10
Target Node = 8
Output: 7

Input:      
          1
        /   \
      2      3
    /  \      \
   4    5      7
  /    / 
 8    10
Target Node = 10
Output: 5
