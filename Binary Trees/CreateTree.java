public static void createTree(Node root, ArrayList<Integer> v ){
        if (v == null || v.size() == 0) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int index = 1;
        while (!queue.isEmpty() && index < v.size()) {
            Node current = queue.poll();

            // Add left child
            if (index < v.size() && v.get(index) != null) {
                current.left = new Node(v.get(index));
                queue.add(current.left);
            }
            index++;

            // Add right child
            if (index < v.size() && v.get(index) != null) {
                current.right = new Node(v.get(index));
                queue.add(current.right);
            }
            index++;
        }
    }

Input: 
nodes = [1 2 3 4 5 6 7]
Output: 
         1
       /   \
     2       3
   /  \     /  \
   4  5    6   7
