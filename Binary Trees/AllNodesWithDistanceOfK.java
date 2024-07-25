public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode> parents=new HashMap<>();
        markParents(root, parents);

        HashMap<TreeNode,Boolean> visited=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();

        q.offer(target);
        visited.put(target,true);

        int level = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            if (level++ == k)
                break;

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.peek();
                q.poll();

                if (curr.left!=null && !visited.getOrDefault(curr.left,false)) {
                    q.offer(curr.left);
                    visited.put(curr.left, true);
                }

                if (curr.right!=null && !visited.getOrDefault(curr.right,false)) {
                    q.offer(curr.right);
                    visited.put(curr.right, true);
                }

                if (parents.get(curr)!=null && !visited.getOrDefault(parents.get(curr),false))
                {
                    q.offer(parents.get(curr));
                    visited.put(parents.get(curr),true);
                }
            }
        }

        List<Integer> res=new ArrayList<>();
        while (!q.isEmpty()) 
        {
            res.add(q.peek().val);
            q.poll();
        }

        return res;
    }
    private void markParents(TreeNode root, HashMap<TreeNode,TreeNode> parents) 
    {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) 
        {
            TreeNode curr = q.peek();
            q.poll();
            if (curr.left!=null)
            {
                parents.put(curr.left, curr);
                q.offer(curr.left);
            }

            if (curr.right!=null) {
                parents.put(curr.right,curr);
                q.offer(curr.right);
            }
        }
    }

Input: root = [3,5,1,6,2,0,8,null,null,7,4], target = 5, k = 2
Output: [7,4,1]
Input: root = [1], target = 1, k = 3
Output: []
