public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, List<Integer>>> nodes = new TreeMap<>();
        Queue<Pair<TreeNode, Pair<Integer, Integer>>> todo = new LinkedList<>();
        todo.add(new Pair<>(root, new Pair<>(0, 0)));

        while (!todo.isEmpty()) {
            Pair<TreeNode, Pair<Integer, Integer>> p = todo.poll();
            TreeNode temp = p.getKey();
            int x = p.getValue().getKey();
            int y = p.getValue().getValue();

            nodes.computeIfAbsent(x, k -> new TreeMap<>())
                .computeIfAbsent(y, k -> new ArrayList<>())
                .add(temp.val);

            if (temp.left != null) {
                todo.add(new Pair<>(temp.left, new Pair<>(x - 1, y + 1)));
            }
            if (temp.right != null) {
                todo.add(new Pair<>(temp.right, new Pair<>(x + 1, y + 1)));
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, TreeMap<Integer, List<Integer>>> entry : nodes.entrySet()) {
            List<Integer> col = new ArrayList<>();
            for (List<Integer> list : entry.getValue().values()) {
                Collections.sort(list);
                col.addAll(list);
            }
            result.add(col);
        }

        return result;
    }

Input: root = [3,9,20,null,null,15,7]
Output: [[9],[3,15],[20],[7]]
Input: root = [1,2,3,4,5,6,7]
Output: [[4],[2],[1,5,6],[3],[7]]
